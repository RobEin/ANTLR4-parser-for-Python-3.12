/*
 * Project      : an ErrorListener class to collect and display indentation errors
 */

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class IndentationErrorListener extends BaseErrorListener {
    private static final List<String> _errorList = new ArrayList<>();

    public static void lexerError(String msg) {
        _errorList.add(msg);
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        final String startOfMessage = " line " + line + ":\t ";

        // ************************************************************
        // *** Not exact matches! This is only for a demonstration. ***
        // ************************************************************
        if (msg.startsWith("missing INDENT at ")) {
            _errorList.add(startOfMessage + "expected an indented block");
        } else if (msg.startsWith("mismatched input '<INDENT>") ||
                   msg.startsWith("extraneous input '<INDENT>")) {

            _errorList.add(startOfMessage + "unexpected indent");
        }
    }

    public static void displayErrors() {
        if (_errorList.size() > 0) {
            String errors = "\nINDENTATION ERROR:\n" + String.join("\n", _errorList);
            System.err.println(errors);
        }
    }
}
