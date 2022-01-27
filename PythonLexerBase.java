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
 * Developed by : Robert Einhorn, robert.einhorn.hu@gmail.com
 */


// *** lexer grammar dependencies to use this class with other (old) ANTLR4 Python grammars
/*
lexer grammar PythonLexer;
options { superClass=PythonLexerBase; }
tokens { INDENT, DEDENT }
OPEN_PAREN   : '(';
OPEN_BRACK   : '[';
OPEN_BRACE   : '{';
CLOSE_PAREN  : ')';
CLOSE_BRACK  : ']';
CLOSE_BRACE  : '}';
TYPE_COMMENT : '#' WS? 'type:' WS? ~[\r\n\f]*;
NEWLINE      : OS_INDEPEND_NL WS?;
WS           : [ \t]+         -> channel(HIDDEN);
COMMENT      : '#' ~[\r\n\f]* -> channel(HIDDEN);
fragment OS_INDEPEND_NL : '\r'? '\n';
 */


import java.util.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonToken;

public abstract class PythonLexerBase extends Lexer {
    protected PythonLexerBase(CharStream input) {
        super(input);
    }

    // A stack that keeps track of the indentation lengths
    private final Stack<Integer> _indentLengths = new Stack<>();
    // A linked list where tokens are waiting to be loaded into the token stream
    private final LinkedList<Token> _pendingTokens = new LinkedList<>();

    // An int that saves the last pending token type
    private int _lastPendingTokenType = 0;
    // Was there a statement in the input?
    private boolean _wasStatement = false;

    // The amount of opened braces, brackets and parenthesis
    private int _opened = 0;

    // Was there a space char in the indentations?
    private boolean _wasSpaceIndentation = false;
    // Was there a tab char in the indentations?
    private boolean _wasTabIndentation = false;

    private Token _curToken; // current (under processing) token
    private Token _ffgToken; // following (lookahead) token

    @Override
    public Token nextToken() { // reading of the input stream until a return EOF
        if (_input.size() == 0) {
            return new CommonToken(EOF, "<EOF>");
        } else {
            checkNextToken();
            return _pendingTokens.pollFirst(); // add the queued token to the token stream
        }
    }

    private void checkNextToken() {
        if (_lastPendingTokenType != EOF) {
            setCurrentAndFollowingTokens();
            handleStartOfInput();
            switch (_curToken.getType()) {
                case PythonLexer.OPEN_PAREN, PythonLexer.OPEN_BRACK, PythonLexer.OPEN_BRACE -> {
                    _opened++;
                    addPendingToken(_curToken);
                }
                case PythonLexer.CLOSE_PAREN, PythonLexer.CLOSE_BRACK, PythonLexer.CLOSE_BRACE -> {
                    _opened--;
                    addPendingToken(_curToken);
                }
                case PythonLexer.NEWLINE -> handleNEWLINE_Token();
                case EOF -> handleEOF_token();
                default -> addPendingToken(_curToken);
            }
        }
    }

    private void setCurrentAndFollowingTokens() {
        _curToken = _ffgToken == null ? super.nextToken() : _ffgToken;
        _ffgToken = _curToken.getType() == EOF ? _curToken : super.nextToken();
    }

    // initialize the _indentLengths stack
    // hide the leading NEWLINE tokens
    // if exists, find the first statement (not NEWLINE, not EOF token) that comes from the default channel
    // insert a leading INDENT token if necessary
    private void handleStartOfInput() {
        if (_indentLengths.size() == 0) { // We're at the first token
            // initialize the stack with a default 0 indentation length
            _indentLengths.push(0); // this will never be popped off
            while (_curToken.getType() != EOF) {
                if (_curToken.getChannel() == Lexer.DEFAULT_TOKEN_CHANNEL) {
                    if (_curToken.getType() == PythonLexer.NEWLINE) {
                        // all the NEWLINE tokens must be ignored (hidden) before the first statement
                        // because the NEWLINE token is always after the statement in the parser rules
                        hideAndAddCurrentTokenToPendingTokens();
                    } else { // We're at the first statement
                        _wasStatement = true;
                        insertLeadingIndentToken();
                        return; // continue the processing of the current token with checkNextToken()
                    }
                } else {
                    addPendingToken(_curToken); // can be WS, LINE_JOINING and COMMENT tokens
                }
                setCurrentAndFollowingTokens();
            } // continue the processing of the EOF token with checkNextToken()
        }
    }

    private void insertLeadingIndentToken() {
        if (!_pendingTokens.isEmpty()) { // there is a token before the first statement
            Token prevToken = _pendingTokens.peekLast();
            // make sure the previous token contains space or tab
            final boolean containsSpaceOrTab = switch (prevToken.getType()) {
                case PythonLexer.WS -> true;
                case PythonLexer.NEWLINE -> getIndentationLength(prevToken.getText()) > 0;
                default -> false; // the rest can be only a LINE_JOINING token (COMMENT token cannot be)
            };
            if (containsSpaceOrTab) { // there is an indentation before the first statement
                // insert an INDENT token before the first statement to raise an 'unexpected indent' error later by the parser
                createAndAddPendingToken(PythonLexer.INDENT, _curToken); // insert an INDENT token before the _curToken
            }
        }
    }

    private void handleNEWLINE_Token() {
        if (_opened == 0) { //*** https://docs.python.org/3/reference/lexical_analysis.html#implicit-line-joining
            switch (_ffgToken.getType()) { // the next token type after the current NEWLINE token
                //*** https://docs.python.org/3/reference/lexical_analysis.html#blank-lines
                //   We're on a blank line or before a comment, We need to ignore (hide) the current NEWLINE token
                case PythonLexer.NEWLINE, PythonLexer.COMMENT, PythonLexer.TYPE_COMMENT ->
                    hideAndAddCurrentTokenToPendingTokens();
                default -> {
                    addPendingToken(_curToken); // add the current NEWLINE token to the token stream
                    insertIndentDedentTokens();
                }
            }
        } else { // We're in implicit line joining, We need to ignore (hide) the current NEWLINE token
            hideAndAddCurrentTokenToPendingTokens();
        }
    }

    private void insertIndentDedentTokens() { //*** https://docs.python.org/3/reference/lexical_analysis.html#indentation
        int prevIndentLength = _indentLengths.peek();
        final int curIndentLength = getIndentationLength(_curToken.getText());
        if (curIndentLength > prevIndentLength) {
            if (_ffgToken.getType() != EOF) {
                createAndAddPendingToken(PythonLexer.INDENT, _ffgToken); // insert an INDENT token before the _ffgToken
                _indentLengths.push(curIndentLength);
            }
        } else {
            while (curIndentLength < prevIndentLength) { // more than 1 DEDENT token may be inserted to the token stream
                _indentLengths.pop();
                prevIndentLength = _indentLengths.peek();
                createAndAddPendingToken(PythonLexer.DEDENT, _ffgToken); // insert a DEDENT token before the _ffgToken
                if (curIndentLength > prevIndentLength && _ffgToken.getType() != EOF) {
                    IndentationErrorListener.lexerError(" line " + _ffgToken.getLine() + ":"
                            + _ffgToken.getCharPositionInLine()
                            + "\t unindent does not match any outer indentation level");
                }
            }
        }
    }

    private void handleEOF_token() {
        if (_wasStatement) {
            insertTrailingTokens();
            checkSpaceAndTabIndentation();
        }
        addPendingToken(_curToken); // add the current EOF token to the token stream
    }

    private void insertTrailingTokens() {
        switch (_lastPendingTokenType) {
            case PythonLexer.NEWLINE, PythonLexer.DEDENT -> { // no need for a trailing NEWLINE token
            }
            default -> createAndAddPendingToken(PythonLexer.NEWLINE, _ffgToken); // insert before the _ffgToken
            //         insert an extra trailing NEWLINE token that serves as the end of the last statement
        }

        while (_indentLengths.size() > 1) { // Now insert as much trailing DEDENT tokens as needed to the token stream
            createAndAddPendingToken(PythonLexer.DEDENT, _ffgToken); // insert a DEDENT token before the _ffgToken
            _indentLengths.pop();
        }
    }

    private void hideAndAddCurrentTokenToPendingTokens() {
        // create a hidden copy of the current token and add it to the pending tokens
        createAndAddPendingToken(_curToken.getStartIndex(), _curToken.getStopIndex(), _curToken.getText()
                , _curToken.getType(), Lexer.HIDDEN, _curToken.getLine(), _curToken.getCharPositionInLine());
    }

    private void createAndAddPendingToken(int type, Token followingToken) {
        createAndAddPendingToken(followingToken.getStartIndex(), followingToken.getStartIndex() - 1
                , "<" + getVocabulary().getDisplayName(type) + ">", type
                , Lexer.DEFAULT_TOKEN_CHANNEL
                , followingToken.getLine(), followingToken.getCharPositionInLine());
    }

    private void createAndAddPendingToken(int startIndex, int stopIndex, String text, int type, int channel
            , int line, int charPositionInLine) {

        CommonToken token = new CommonToken(_tokenFactorySourcePair, type, channel, startIndex, stopIndex);
        token.setText(text);
        token.setLine(line);
        token.setCharPositionInLine(charPositionInLine);
        addPendingToken(token);
    }

    private void addPendingToken(Token token) {
        _pendingTokens.addLast(token); // token will be added to the token stream
        _lastPendingTokenType = token.getType();
        // save the last token type because the _pendingTokens linked list may be empty by the nextToken()
    }

    // Calculates the indentation of the provided spaces, taking the
    // following rules into account:
    //
    // "Tabs are replaced (from left to right) by one to eight spaces
    //  such that the total number of characters up to and including
    //  the replacement is a multiple of eight [...]"
    //
    //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
    private int getIndentationLength(String textOfMatchedNEWLINE) {
        int length = 0;
        for (int i = 0; i < textOfMatchedNEWLINE.length(); i++) {
            switch (textOfMatchedNEWLINE.charAt(i)) {
                case ' ' -> { // A normal space char
                    _wasSpaceIndentation = true;
                    length++;
                }
                case '\t' -> {
                    _wasTabIndentation = true;
                    length += 8 - (length % 8);
                }
            }
        }
        return length;
    }

    private void checkSpaceAndTabIndentation() {
        if (_wasSpaceIndentation && _wasTabIndentation) {
            IndentationErrorListener.addWarning(" mixture of space and tab were used for indentation");
        }
    }
}
