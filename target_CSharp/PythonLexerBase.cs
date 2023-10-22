/*
The MIT License (MIT)
Copyright (c) 2021 Robert Einhorn

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

/*
 * Project      : Python Indent/Dedent handler for ANTLR4 grammars
 *
 * Developed by : Robert Einhorn
 */

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;
using System.Xml.Linq;
using Antlr4.Runtime;

public abstract class PythonLexerBase : Lexer
{
    // A stack that keeps track of the indentation lengths
    private readonly LinkedList<int> _indentLengths = new LinkedList<int>();
    // A linked list where tokens are waiting to be loaded into the token stream
    private readonly LinkedList<IToken> _pendingTokens = new LinkedList<IToken>();
    // last pending token types
    private int _previousPendingTokenType = 0;
    private int _lastPendingTokenTypeForDefaultChannel = 0;

    // The amount of opened parentheses, square brackets, or curly braces
    private int _opened = 0;
    // The amount of opened curly brace in the current lexer mode
    private readonly LinkedList<int> _paren_or_bracketOpened = new LinkedList<int>();

    // Was there a space character in the indentations?
    private bool _wasSpaceIndentation = false;
    // Was there a tab character in the indentations?
    private bool _wasTabIndentation = false;
    private bool _wasIndentationMixedWithSpacesAndTabs = false;
    private const int INVALID_LENGTH = -1; // invalid length for mixed indentations with spaces and tabs

    private CommonToken _curToken = null!; // current (under processing) token
    private IToken _ffgToken = null!;      // following (look ahead) token

    private const string _ERR_TXT = " ERROR: ";

    protected PythonLexerBase(ICharStream input) : base(input)
    {
    }

    protected PythonLexerBase(ICharStream input, TextWriter output, TextWriter errorOutput) : base(input, output, errorOutput)
    {
    }

    public override IToken NextToken() // reading the input stream until a return EOF
    {
        CheckNextToken();
        IToken firstPendingToken = _pendingTokens.First.Value;
        _pendingTokens.RemoveFirst();
        return firstPendingToken; // add the queued token to the token stream
    }

    private void CheckNextToken()
    {
        if (_previousPendingTokenType != Eof)
        {
            SetCurrentAndFollowingTokens();
            if (_indentLengths.Count == 0) // We're at the first token
            {
                HandleStartOfInput();
            }

            switch (_curToken.Type)
            {
                case PythonLexer.LPAR:   // OPEN_PAREN
                case PythonLexer.LSQB:   // OPEN_BRACK
                case PythonLexer.LBRACE: // OPEN_BRACE
                    _opened++;
                    AddPendingToken(_curToken);
                    break;
                case PythonLexer.RPAR:   // CLOSE_PAREN
                case PythonLexer.RSQB:   // CLOSE_BRACK
                case PythonLexer.RBRACE: // CLOSE_BRACE
                    _opened--;
                    AddPendingToken(_curToken);
                    break;
                case PythonLexer.NEWLINE:
                    HandleNEWLINEtoken();
                    break;
                case PythonLexer.STRING:
                    HandleSTRINGtoken();
                    break;
                case PythonLexer.FSTRING_MIDDLE:
                    HandleFSTRING_MIDDLE_token();
                    break;
                case PythonLexer.ERROR_TOKEN:
                    ReportLexerError("token recognition error at: '" + _curToken.Text + "'");
                    AddPendingToken(_curToken);
                    break;
                case Eof:
                    HandleEOFtoken();
                    break;
                default:
                    AddPendingToken(_curToken);
                    break;
            }
            HandleFORMAT_SPECIFICATION_MODE();
        }
    }

    private void SetCurrentAndFollowingTokens()
    {
        _curToken = _ffgToken == null ?
                    new CommonToken(base.NextToken()) :
                    new CommonToken(_ffgToken);

        HandleFStringLexerModes();

        _ffgToken = _curToken.Type == Eof ?
                    _curToken :
                    base.NextToken();
    }

    // initialize the _indentLengths stack
    // hide the leading NEWLINE token(s)
    // if exists, find the first statement (not NEWLINE, not EOF token) that comes from the default channel
    // insert a leading INDENT token if necessary
    private void HandleStartOfInput()
    {
        // initialize the stack with a default 0 indentation length
        _indentLengths.AddLast(0); // this will never be popped off
        while (_curToken.Type != Eof)
        {
            if (_curToken.Channel == TokenConstants.DefaultChannel)
            {
                if (_curToken.Type == PythonLexer.NEWLINE)
                {
                    // all the NEWLINE tokens must be ignored before the first statement
                    HideAndAddPendingToken(_curToken);
                }
                else
                { // We're at the first statement
                    InsertLeadingIndentToken();
                    return; // continue the processing of the current token with CheckNextToken()
                }
            }
            else
            {
                AddPendingToken(_curToken); // it can be WS, EXPLICIT_LINE_JOINING, or COMMENT token
            }
            SetCurrentAndFollowingTokens();
        } // continue the processing of the EOF token with CheckNextToken()
    }

    private void InsertLeadingIndentToken()
    {
        if (_previousPendingTokenType == PythonLexer.WS)
        {
            var prevToken = _pendingTokens.Last.Value;
            if (GetIndentationLength(prevToken.Text) != 0) // there is an "indentation" before the first statement
            {
                const string errMsg = "first statement indented";
                ReportLexerError(errMsg);
                // insert an INDENT token before the first statement to raise an 'unexpected indent' error later by the parser
                CreateAndAddPendingToken(PythonLexer.INDENT, TokenConstants.DefaultChannel, _ERR_TXT + errMsg, _curToken);
            }
        }
    }

    private void HandleNEWLINEtoken()
    {
        if (_opened > 0)
        {
            //*** https://docs.python.org/3/reference/lexical_analysis.html#implicit-line-joining
            HideAndAddPendingToken(_curToken); // We're in an implicit line joining, ignore the current NEWLINE token
        }
        else
        {
            CommonToken nlToken = (CommonToken)_curToken; // save the current NEWLINE token
            bool isLookingAhead = _ffgToken.Type == PythonLexer.WS;
            if (isLookingAhead)
            {
                SetCurrentAndFollowingTokens(); // set the two next tokens
            }

            switch (_ffgToken.Type)
            {
                case PythonLexer.NEWLINE:      // We're before a blank line
                case PythonLexer.COMMENT:      // We're before a comment
                case PythonLexer.TYPE_COMMENT: // We're before a type comment
                    HideAndAddPendingToken(nlToken); // ignore the NEWLINE token
                    if (isLookingAhead)
                    {
                        AddPendingToken(_curToken);  // WS token
                    }
                    break;
                default:
                    AddPendingToken(nlToken);
                    if (isLookingAhead)
                    { // We're on whitespace(s) followed by a statement
                        int indentationLength = _ffgToken.Type == Eof ?
                                                0 :
                                                GetIndentationLength(_curToken.Text);

                        if (indentationLength != INVALID_LENGTH)
                        {
                            AddPendingToken(_curToken);  // WS token
                            InsertIndentOrDedentToken(indentationLength); // may insert INDENT token or DEDENT token(s)                            
                        }
                        else
                        {
                            ReportError("inconsistent use of tabs and spaces in indentation");
                        }
                    }
                    else
                    {
                        // We're at a newline followed by a statement (there is no whitespace before the statement)
                        InsertIndentOrDedentToken(0); // may insert DEDENT token(s)
                    }
                    break;
            }
        }
    }

    private void InsertIndentOrDedentToken(int curIndentLength)
    {
        //*** https://docs.python.org/3/reference/lexical_analysis.html#indentation
        int prevIndentLength = _indentLengths.Last.Value; // never has a null value
        if (curIndentLength > prevIndentLength)
        {
            CreateAndAddPendingToken(PythonLexer.INDENT, TokenConstants.DefaultChannel, null, _ffgToken);
            _indentLengths.AddLast(curIndentLength);
        }
        else
        {
            while (curIndentLength < prevIndentLength)
            { // more than 1 DEDENT token may be inserted into the token stream
                _indentLengths.RemoveLast();
                prevIndentLength = _indentLengths.Last.Value; // never has a null value
                if (curIndentLength <= prevIndentLength)
                {
                    CreateAndAddPendingToken(PythonLexer.DEDENT, TokenConstants.DefaultChannel, null, _ffgToken);
                }
                else
                {
                    ReportError("inconsistent dedent");
                }
            }
        }
    }

    private void HandleSTRINGtoken()
    {
        // remove the \<newline> escape sequences from the string literal
        // https://docs.python.org/3.11/reference/lexical_analysis.html#string-and-bytes-literals
        string line_joinFreeStringLiteral = Regex.Replace(_curToken.Text, "\\\\r?\\n", "");
        if (_curToken.Text.Length == line_joinFreeStringLiteral.Length)
        {
            AddPendingToken(_curToken);
        }
        else
        {
            CommonToken originalSTRINGtoken = new CommonToken(_curToken); // backup the original token
            _curToken.Text = line_joinFreeStringLiteral;
            AddPendingToken(_curToken);                  // add the modified token with inline string literal
            HideAndAddPendingToken(originalSTRINGtoken); // add the original token with a hidden channel
            // this inserted hidden token allows to restore the original string literal with the \<newline> escape sequences
        }
    }

    private void HandleFSTRING_MIDDLE_token()
    {
        string fsMid = _curToken.Text;
        fsMid = fsMid.Replace("{{", "{_").Replace("}}", "}_");
        Regex regex = new Regex("(?<=[{}])_");
        string[] arrOfStr = regex.Split(fsMid);
        foreach (string s in arrOfStr)
        {
            if (!String.IsNullOrEmpty(s))
            {
                CreateAndAddPendingToken(PythonLexer.FSTRING_MIDDLE, TokenConstants.DefaultChannel, s, _ffgToken);
                string lastCharacter = s.Substring(s.Length - 1);
                if ("{}".Contains(lastCharacter))
                {
                    CreateAndAddPendingToken(PythonLexer.FSTRING_MIDDLE, TokenConstants.HiddenChannel, lastCharacter, _ffgToken);
                }
            }
        }
    }

    private void HandleFStringLexerModes()
    {
        if (ModeStack.Count > 0)
        {
            switch (_curToken.Type)
            {
                case PythonLexer.LBRACE:
                    PushMode(PythonLexer.DEFAULT_MODE);
                    _paren_or_bracketOpened.AddLast(0);
                    break;
                case PythonLexer.LPAR:
                case PythonLexer.LSQB:
                    _paren_or_bracketOpened.Last.Value += 1;
                    break;
                case PythonLexer.RPAR:
                case PythonLexer.RSQB:
                    _paren_or_bracketOpened.Last.Value -= 1;
                    break;
                case PythonLexer.COLON:
                    if (_paren_or_bracketOpened.Last.Value == 0)
                    {
                        switch (ModeStack.Peek())
                        {
                            case PythonLexer.SINGLE_QUOTE_FSTRING_MODE:
                            case PythonLexer.LONG_SINGLE_QUOTE_FSTRING_MODE:
                            case PythonLexer.SINGLE_QUOTE_FORMAT_SPECIFICATION_MODE:
                                Mode(PythonLexer.SINGLE_QUOTE_FORMAT_SPECIFICATION_MODE);
                                break;
                            case PythonLexer.DOUBLE_QUOTE_FSTRING_MODE:
                            case PythonLexer.LONG_DOUBLE_QUOTE_FSTRING_MODE:
                            case PythonLexer.DOUBLE_QUOTE_FORMAT_SPECIFICATION_MODE:
                                Mode(PythonLexer.DOUBLE_QUOTE_FORMAT_SPECIFICATION_MODE);
                                break;
                        }
                    }
                    break;
                case PythonLexer.RBRACE:
                    switch (CurrentMode)
                    {
                        case PythonLexer.DEFAULT_MODE:
                        case PythonLexer.SINGLE_QUOTE_FORMAT_SPECIFICATION_MODE:
                        case PythonLexer.DOUBLE_QUOTE_FORMAT_SPECIFICATION_MODE:
                            PopMode();
                            _paren_or_bracketOpened.RemoveLast();
                            break;
                        default:
                            ReportLexerError("f-string: single '}' is not allowed");
                            break;
                    }
                    break;
            }
        }
    }

    private void HandleFORMAT_SPECIFICATION_MODE()
    {
        if (ModeStack.Count > 0 && _ffgToken.Type == PythonLexer.RBRACE)
        {
            switch (_curToken.Type)
            {
                case PythonLexer.COLON:
                case PythonLexer.RBRACE:
                    CreateAndAddPendingToken(PythonLexer.FSTRING_MIDDLE, TokenConstants.DefaultChannel, "", _ffgToken);
                    break;
            }
        }
    }

    private void InsertTrailingTokens()
    {
        switch (_lastPendingTokenTypeForDefaultChannel)
        {
            case PythonLexer.NEWLINE:
            case PythonLexer.DEDENT:
                break; // no trailing NEWLINE token is needed
            default:
                // insert an extra trailing NEWLINE token that serves as the end of the last statement
                CreateAndAddPendingToken(PythonLexer.NEWLINE, TokenConstants.DefaultChannel, null, _ffgToken);
                break;
        }
        InsertIndentOrDedentToken(0); // Now insert as many trailing DEDENT tokens as needed
    }

    private void HandleEOFtoken()
    {
        if (_lastPendingTokenTypeForDefaultChannel > 0)
        { // there was a statement in the input (leading NEWLINE tokens are hidden)
            InsertTrailingTokens();
        }
        AddPendingToken(_curToken);
    }

    private void HideAndAddPendingToken(CommonToken token)
    {
        token.Channel = TokenConstants.HiddenChannel;
        AddPendingToken(token);
    }

    private void CreateAndAddPendingToken(int type, int channel, string text, IToken baseToken)
    {
        CommonToken token = new CommonToken((CommonToken)baseToken);
        token.Type = type;
        token.Channel = channel;
        token.StopIndex = baseToken.StartIndex - 1;

        token.Text = text == null
                   ? "<" + Vocabulary.GetSymbolicName(type) + ">"
                   : text;

        AddPendingToken(token);
    }

    private void AddPendingToken(IToken token)
    {
        // save the last pending token type because the _pendingTokens linked list can be empty by the nextToken()
        _previousPendingTokenType = token.Type;
        if (token.Channel == TokenConstants.DefaultChannel)
        {
            _lastPendingTokenTypeForDefaultChannel = _previousPendingTokenType;
        }
        _pendingTokens.AddLast(token); // the token will be added to the token stream
    }

    // Calculates the indentation of the provided spaces, taking the
    // following rules into account:
    //
    // "Tabs are replaced (from left to right) by one to eight spaces
    //  such that the total number of characters up to and including
    //  the replacement is a multiple of eight [...]"
    //
    //  -- https://docs.python.org/3/reference/lexical_analysis.html#indentation
    private int GetIndentationLength(string textWS) // the textWS may contain spaces, tabs or formfeeds
    {
        const int TAB_LENGTH = 8; // the standard number of spaces to replace a tab with spaces
        int length = 0;
        foreach (char ch in textWS)
        {
            switch (ch)
            {
                case ' ': // A normal space char
                    _wasSpaceIndentation = true;
                    length += 1;
                    break;
                case '\t':
                    _wasTabIndentation = true;
                    length += TAB_LENGTH - (length % TAB_LENGTH);
                    break;
            }
        }

        if (_wasTabIndentation && _wasSpaceIndentation)
        {
            if (!_wasIndentationMixedWithSpacesAndTabs)
            {
                _wasIndentationMixedWithSpacesAndTabs = true;
                return INVALID_LENGTH; // only for the first inconsistent indent
            }
        }
        return length;
    }

    private void ReportLexerError(string errMsg)
    {
        ErrorListenerDispatch.SyntaxError(ErrorOutput, this, _curToken.Type, _curToken.Line, _curToken.Column, _ERR_TXT + errMsg, null);
    }

    private void ReportError(string errMsg)
    {
        ReportLexerError(errMsg);

        // the ERROR_TOKEN will raise an error in the parser
        CreateAndAddPendingToken(PythonLexer.ERROR_TOKEN, TokenConstants.DefaultChannel, _ERR_TXT + errMsg, _ffgToken);
    }
}
