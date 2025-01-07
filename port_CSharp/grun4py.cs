// ******* GRUN (Grammar Unit Test) for Python *******

using System;
using System.Text.RegularExpressions;
using System.Text;
using Antlr4.Runtime;

namespace grun4py
{
    internal static class Program
    {
        public static int Main(string[] args)
        {
            if (args.Length < 1)
            {
                Console.Error.WriteLine("Error: Please provide an input file path");
                return 1;
            }

            try
            {
                var filePath = args[0];
                var input = GetEncodedInputStreamByPythonComment(filePath);
                var lexer = new PythonLexer(input);
                var tokens = new CommonTokenStream((ITokenSource)lexer);
                var parser = new PythonParser(tokens);

                tokens.Fill(); // Test the lexer grammar
                foreach (IToken t in tokens.GetTokens())
                {
                    Console.WriteLine(GetTokenMetaDataWithTokenName(t));
                }

                parser.file_input(); // Test the parser grammar
                return parser.NumberOfSyntaxErrors;

            }
            catch (Exception ex)
            {
                Console.Error.WriteLine($"Error: {ex.Message}");
                return 1; // Error occurred, returning non-zero exit code
            }
        }

        private static string GetTokenMetaDataWithTokenName(IToken token)
        {
            string tokenText = ReplaceSpecialCharacters(token.Text);
            string tokenName = token.Type == TokenConstants.EOF ? "EOF" : PythonLexer.DefaultVocabulary.GetDisplayName(token.Type);
            string channelText = token.Channel == TokenConstants.DefaultChannel ? 
                                 "" :
                                 $"channel={PythonLexer.channelNames[token.Channel]},";

            // Modified format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=ChannelName,Line:Column]
            return $"[@{token.TokenIndex},{token.StartIndex}:{token.StopIndex}='{tokenText}',<{tokenName}>,{channelText}{token.Line}:{token.Column}]";
        }

        private static string ReplaceSpecialCharacters(string text)
        {
            return text.Replace("\n", @"\n")
                       .Replace("\r", @"\r")
                       .Replace("\t", @"\t")
                       .Replace("\f", @"\f");

        }

        public static ICharStream? GetEncodedInputStreamByPythonComment(string filePath)
        {
            string encodingName = "";
            var ws_commentPattern = new Regex(@"^[ \t\f]*(#.*)?$");

            try
            {
                using FileStream fs = new(filePath, FileMode.Open, FileAccess.Read); // read in binary mode
                using StreamReader reader = new(fs, Encoding.ASCII);
                for (int lineCount = 0; lineCount < 2; lineCount++)
                {
                    string? line = reader.ReadLine();
                    if (line == null)
                    {
                        break; // EOF reached
                    }

                    if (ws_commentPattern.IsMatch(line)) // WS? + COMMENT? found
                    {
                        encodingName = GetEncodingName(line);
                        if (encodingName != "") // encoding found
                        {
                            break;
                        }
                    }
                    else
                    {
                        break; // statement or backslash found (line is not empty, not whitespace(s), not comment)
                    }
                }
            }
            catch (Exception)
            {
                // Console.WriteLine($"An error occurred: {e.Message}");
            }

            const string DEFAULT_PYTHON_ENCODING = "utf-8"; // default encoding for Python source code
            if (encodingName == "")
            {
                encodingName = DEFAULT_PYTHON_ENCODING;
            }

            try // encoding test for ANTLR4
            {
                return CharStreams.fromPath(filePath, Encoding.GetEncoding(encodingName));
            }
            catch (Exception)
            {
                return CharStreams.fromPath(filePath, Encoding.GetEncoding(DEFAULT_PYTHON_ENCODING));
            }

        }

        public static string GetEncodingName(string commentText) // https://peps.python.org/pep-0263/#defining-the-encoding
        {
            var encodingCommentPattern = new Regex(@"^[ \t\f]*#.*?coding[:=][ \t]*([-_.a-zA-Z0-9]+)");
            var match = encodingCommentPattern.Match(commentText);
            if (match.Success)
            {
                string encodingName = match.Groups[1].Value;

                // normalize encoding name
                var encodingMap = new Dictionary<string, string>
                {
                    { "cp1252", "latin1" },
                    { "latin-1", "latin1" },
                    { "iso-8859-1", "latin1" }
                    // more encoding pairs
                };

                return encodingMap.TryGetValue(encodingName.ToLower(), out var normalizedEncodingName)
                    ? normalizedEncodingName
                    : encodingName;
            }
            return "";
        }
    }
}
