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
 * Project      : a helper class to implement PEG grammar specific expressions in an ANTLR4 grammar
 *
 * Developed by : Robert Einhorn, robert.einhorn.hu@gmail.com
 */

// Related PEG grammar expressions:
// https://www.python.org/dev/peps/pep-0617/#id33
// https://www.python.org/dev/peps/pep-0617/#id34

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class PythonParserBase extends Parser {
    protected PythonParserBase(TokenStream input) {
        super(input);
        //this.removeErrorListeners();
        this.addErrorListener(new IndentationErrorListener());
    }

    protected boolean is_(int type1) {
        return _input.LT(1).getType() == type1;
    }

    protected boolean isnot_(int type1) {
        return !is_(type1);
    }

    protected boolean is_(int type1, int type2) {
        int nextTokenType = _input.LT(1).getType();
        return nextTokenType == type1 || nextTokenType == type2;
    }

    protected boolean isnot_(int type1, int type2) {
        return !is_(type1, type2);
    }

    protected boolean is_(int type1, int type2, int type3) {
        int nextTokenType = _input.LT(1).getType();
        return nextTokenType == type1 || nextTokenType == type2 || nextTokenType == type3;
    }

    protected boolean isnot_(int type1, int type2, int type3) {
        return !is_(type1, type2, type3);
    }

    protected boolean are_(int type1, int type2) {
        return _input.LT(1).getType() == type1 && _input.LT(2).getType() == type2;
    }

    // https://docs.python.org/3/reference/lexical_analysis.html#soft-keywords
    protected boolean isCurrentToken(String tokenText) {
        return getCurrentToken().getText().equals(tokenText);
    }

    protected boolean is_notCurrentToken(String tokenText) {
        return !isCurrentToken(tokenText);
    }

    @Override
    public void exitRule() {
        super.exitRule();
        if (getCurrentToken().getType() == EOF) {
            IndentationErrorListener.displayWarningsAndErrors();
        }
    }
}
