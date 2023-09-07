/*
 * Project      : a helper class to implement specific PEG grammar expressions in an ANTLR4 grammar
 *
 * Developed by : Robert Einhorn
 */

// Related PEG grammar expressions:
// &e
// https://peps.python.org/pep-0617/#e-3
//
// !e
// https://peps.python.org/pep-0617/#e-4

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public abstract class PythonParserBase extends Parser {
    private boolean _isMatchedEOF = false;

    protected PythonParserBase(TokenStream input) {
        super(input);
    }


    protected boolean isCurrentTokenType(int type1) {
        int currentTokenType = getCurrentToken().getType();
        return currentTokenType == type1;
    }

    protected boolean isCurrentTokenType(int type1, int type2) {
        int currentTokenType = getCurrentToken().getType();
        return currentTokenType == type1 ||
               currentTokenType == type2;
    }

    protected boolean isCurrentTokenType(int type1, int type2, int type3) {
        int currentTokenType = getCurrentToken().getType();
        return currentTokenType == type1 ||
               currentTokenType == type2 ||
               currentTokenType == type3;
    }

    protected boolean isnotCurrentTokenType(int type1) {
        return !isCurrentTokenType(type1);
    }

    protected boolean isnotCurrentTokenType(int type1, int type2) {
        return !isCurrentTokenType(type1, type2);
    }

    protected boolean isnotCurrentTokenType(int type1, int type2, int type3) {
        return !isCurrentTokenType(type1, type2, type3);
    }


    protected boolean isTokenTypeSequence(int type1, int type2) {
        return _input.LA(1) == type1 &&
               _input.LA(2) == type2;
    }


    // https://docs.python.org/3/reference/lexical_analysis.html#soft-keywords
    protected boolean isCurrentTokenText(String tokenText) {
        return getCurrentToken().getText().equals(tokenText);
    }

    protected boolean isnotCurrentTokenText(String tokenText) {
        return !isCurrentTokenText(tokenText);
    }

    @Override
    public void exitRule() {
        super.exitRule();
//      if (isMatchedEOF()) { // implemented in Java ANTLR4 runtime but not implemented in Python ANTLR4 runtime (see: PythonParserBase.py)
        if (getCurrentToken().getType() == Token.EOF &&
            _isMatchedEOF == false) {

            _isMatchedEOF = true;
        }
    }
}
