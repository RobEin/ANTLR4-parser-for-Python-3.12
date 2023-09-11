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
    protected PythonParserBase(TokenStream input) {
        super(input);
    }

    protected PythonParserBase self = this; // for compatibility with PythonParserBase.py
    private boolean _isMatchedEOF = false;

    // https://docs.python.org/3/reference/lexical_analysis.html#soft-keywords
    protected boolean isEqualCurrentTokenText(String tokenText) {
        return getCurrentToken().getText().equals(tokenText);
    }

    protected boolean isnotEqualCurrentTokenText(String tokenText) {
        //int t = PythonParser.NEWLINE;
        return !isEqualCurrentTokenText(tokenText);
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
