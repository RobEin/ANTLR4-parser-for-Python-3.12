/*
 * Project      : an ErrorListener class to collect and display indentation warnings and errors
 */

import org.antlr.v4.runtime.*;

public class IndentationErrorListener extends BaseErrorListener {
    private static StringBuilder _sbWarning;
    private static StringBuilder _sbError;

    public static void lexerError(String msg) {
        addError(msg);
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        final String startOfMessage = " line " + line + ":" + charPositionInLine + "\t ";
        final String sINDENT  = PythonLexer.VOCABULARY.getDisplayName(PythonLexer.INDENT);

        // ********************************************************
        // *** Not exact matches! This is only a demonstration. ***
        // ********************************************************
        if (msg.startsWith("no viable alternative at input ") &&
            msg.contains("\\r") &&
            !msg.contains("<" + sINDENT + ">")) {

            addError(startOfMessage + "expected an indented block");
        } else if (msg.startsWith("mismatched input '<" + sINDENT + ">") ||
                   msg.startsWith("extraneous input '<" + sINDENT + ">")) {

            addError(startOfMessage + "unexpected indent");
        }
    }

    private static void addError(String errorMsg) {
        if (_sbError == null) {
            _sbError = new StringBuilder();
            _sbError.append(System.lineSeparator());
            _sbError.append("INDENTATION ERROR:").append(System.lineSeparator());
        }
        _sbError.append(errorMsg).append(System.lineSeparator());
    }

    public static void addWarning(String warningMsg) {
        if (_sbWarning == null) {
            _sbWarning = new StringBuilder();
            _sbWarning.append(System.lineSeparator());
            _sbWarning.append("INDENTATION WARNING:").append(System.lineSeparator());
        }
        _sbWarning.append(warningMsg).append(System.lineSeparator());
    }

    public static void displayWarningsAndErrors() {
        if (_sbWarning != null) {
            System.err.println(_sbWarning);
            _sbWarning = null;
        }

        if (_sbError != null) {
            System.err.println(_sbError);
            _sbError = null;
        }
    }
}
