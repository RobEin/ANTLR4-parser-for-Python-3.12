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
 * Project      : a helper class to convert PEG grammar to ANTLR4 grammar
 *                https://github.com/antlr/grammars-v4/tree/master/python/python_by_peg/src
 * Developed by : Robert Einhorn, robert.einhorn.hu@gmail.com
 */

import java.util.List;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class PythonParserBase extends Parser {
    protected PythonParserBase(TokenStream input) {
        super(input);
        //this.removeErrorListeners();
        this.addErrorListener(new IndentationErrorListener());
    }

    protected final List<Integer> t_lookahead = List.of(PythonLexer.OPEN_PAREN, PythonLexer.OPEN_BRACK, PythonLexer.DOT);

    protected boolean isCurrentToken(String tokenText) {
        return getCurrentToken().getText().equals(tokenText);
    }

    protected boolean is_notCurrentToken(String tokenText) { // for other programming language to call this function without Java logical not operator ('!')
        return !isCurrentToken(tokenText);
    }

    protected boolean isNextToken(List<Integer> tokenTypeAlternatives) {
        return tokenTypeAlternatives.contains(_input.LT(1).getType());
    }

    protected boolean is_notNextToken(List<Integer> tokenTypeAlternatives) { // for other programming language to call this function without Java logical not operator ('!')
        return !isNextToken(tokenTypeAlternatives);
    }

    protected boolean isNextToken(int... tokenTypeAlternatives) {
        int nextTokenType = _input.LT(1).getType();
        for (int type : tokenTypeAlternatives) {
            if (type == nextTokenType) {
                return true;
            }
        }
        return false;
    }

    protected boolean is_notNextToken(int... tokenTypeAlternatives) { // for other programming language to call this function without Java logical not operator ('!')
        return !isNextToken(tokenTypeAlternatives);
    }

    protected boolean isNextToken(char... tokenCharAlternatives) {
        String nextTokenText = _input.LT(1).getText();
        if (nextTokenText != null) {
            if (nextTokenText.length() == 1) {
                char nextTokenChar = nextTokenText.charAt(0);
                for (char c : tokenCharAlternatives) {
                    if (c == nextTokenChar) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    protected boolean is_notNextToken(char... tokenCharAlternatives) { // for other programming language to call this function without Java logical not operator ('!')
        return !isNextToken(tokenCharAlternatives);
    }

    protected boolean isNextToken(String... tokenTextAlternatives) {
        String nextTokenText = _input.LT(1).getText();
        if (nextTokenText != null) {
            for (String text : tokenTextAlternatives) {
                if (text.equals(nextTokenText)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean is_notNextToken(String... tokenTextAlternatives) { // for other programming language to call this function without Java logical not operator ('!')
        return !isNextToken(tokenTextAlternatives);
    }

    protected boolean areNextTokens(int... tokenTypeSequence) {
        int tokenCnt = 1;
        for (int type : tokenTypeSequence) {
            if (type != _input.LT(tokenCnt).getType()) {
                return false;
            }
            tokenCnt++;
        }
        return true;
    }

    @Override
    public void exitRule() {
        super.exitRule();
        if (getCurrentToken().getType() == EOF) {
            IndentationErrorListener.displayWarningsAndErrors();
        }
    }
}
