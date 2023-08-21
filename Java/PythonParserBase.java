import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public abstract class PythonParserBase extends Parser {
    private boolean _isMatchedEOF = false;

    protected PythonParserBase(TokenStream input) {
        super(input);
        //removeErrorListeners();
        addErrorListener(new IndentationErrorListener());
    }

    @Override
    public void exitRule() {
        super.exitRule();
//      if (isMatchedEOF()) { // implemented in Java ANTLR4 runtime but not implemented in Python ANTLR4 runtime (see: PythonParserBase.py)
        if (getCurrentToken().getType() == Token.EOF && _isMatchedEOF == false) {
            _isMatchedEOF = true;
            IndentationErrorListener.displayErrors();
        }
    }
}
