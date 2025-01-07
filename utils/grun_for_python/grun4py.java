// ******* GRUN (Grammar Unit Test) for Python *******

import org.antlr.v4.runtime.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class grun4py {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Error: Please provide an input file path");
            System.exit(1);
        }

        try {
            String filePath = args[0];
            CharStream input = getEncodedInputStreamByPythonComment(filePath);
            PythonLexer lexer = new PythonLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PythonParser parser = new PythonParser(tokens);

            tokens.fill(); // Test the lexer grammar
            for (Token t : tokens.getTokens()) {
                System.out.println(getTokenMetaDataWithTokenName(t));
            }

            parser.file_input(); // Test the parser grammar
            System.exit(parser.getNumberOfSyntaxErrors());

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            System.exit(1); // Error occurred, returning non-zero exit code
        }
    }

    private static String getTokenMetaDataWithTokenName(Token token) {
        String tokenText = replaceSpecialCharacters(token.getText());
        String tokenName = token.getType() == Token.EOF ? "EOF" : PythonLexer.VOCABULARY.getDisplayName(token.getType());
        String channelText = token.getChannel() == Token.DEFAULT_CHANNEL ?
                             "" :
                             "channel=" + PythonLexer.channelNames[token.getChannel()] + ",";

        // Modified format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=ChannelName,Line:Column]
        return String.format("[@%d,%d:%d='%s',<%s>,%s%d:%d]",
                             token.getTokenIndex(), token.getStartIndex(), token.getStopIndex(),
                             tokenText, tokenName, channelText, token.getLine(), token.getCharPositionInLine());
    }

    private static String replaceSpecialCharacters(String text) {
        return text.replace("\n", "\\n")
                   .replace("\r", "\\r")
                   .replace("\t", "\\t")
                   .replace("\f", "\\f");

    }

    public static CharStream getEncodedInputStreamByPythonComment(String filePath) throws IOException {
        String encodingName = "";
        final Pattern ws_commentPattern = Pattern.compile("^[ \\t\\f]*(#.*)?$");
        Path path = Paths.get(filePath);

        try (InputStream inputStream = Files.newInputStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "ASCII"))) {

            for (int lineCount = 0; lineCount < 2; lineCount++) {
                String line = reader.readLine();
                if (line == null) {
                    break; // EOF reached
                }

                if (ws_commentPattern.matcher(line).find()) { // WS* + COMMENT? found
                    encodingName = getEncodingName(line);
                    if (!encodingName.isEmpty()) {
                        break; // encoding found
                    }
                } else {
                    break; // statement or backslash found (line is not empty, not whitespace(s), not comment)
                }
            }
        }

        final String DEFAULT_PYTHON_ENCODING = "utf-8"; // default encoding for Python source code
        if (encodingName.isEmpty()) {
            encodingName = DEFAULT_PYTHON_ENCODING;
        }

        try { // encoding test for ANTLR4
            return CharStreams.fromPath(path, Charset.forName(encodingName));
        } catch (Exception e) {
            return CharStreams.fromPath(path, Charset.forName(DEFAULT_PYTHON_ENCODING));
        }
    }

    public static String getEncodingName(String commentText) { // https://peps.python.org/pep-0263/#defining-the-encoding
        Pattern encodingCommentPattern = Pattern.compile("^[ \t\f]*#.*?coding[:=][ \t]*([-_.a-zA-Z0-9]+)");
        Matcher match = encodingCommentPattern.matcher(commentText);
        if (match.find()) {
            String encodingName = match.group(1);

            // normalize encoding name
            Map<String, String> encodingMap = new HashMap<>();
            encodingMap.put("cp1252", "latin1");
            encodingMap.put("latin-1", "latin1");
            encodingMap.put("iso-8859-1", "latin1");
            // more encoding pairs

            return encodingMap.getOrDefault(encodingName.toLowerCase(), encodingName);
        }
        return "";
    }
}
