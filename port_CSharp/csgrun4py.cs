using Antlr4.Runtime;
using System;

[assembly: CLSCompliant(false)]

namespace csgrun4py
{
    static class Program
    {
        static void Main(string[] args)
        {
            var input = CharStreams.fromPath(args[0]); // default command line argument for IDE: ..\..\..\example.py
            var lexer = new PythonLexer(input);
            var tokens = new CommonTokenStream(lexer);
            var parser = new PythonParser(tokens);

            tokens.Fill();
            foreach (IToken t in tokens.GetTokens())
            {
                Console.WriteLine(GetTokenMetaDataWithTokenName(parser, t));
            }

            parser.file_input();
        }

        private static string GetTokenMetaDataWithTokenName(PythonParser parser, IToken token)
        {
            String tokenText = token.ToString()!;
            String tokenName = token.Type == TokenConstants.EOF ? "EOF" : parser.Vocabulary.GetDisplayName(token.Type);
            String channelText = token.Channel == TokenConstants.DefaultChannel ? "" : "channel=" + token.Channel + ",";

            // original format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenType>,channel=Channel,Line:Column]
            // modified format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=Channel,Line:Column]
            return "[@" + token.TokenIndex + "," + token.StartIndex + ":" + token.StopIndex + "='" + tokenText + "',<" + tokenName + ">," + channelText + token.Line + ":" + token.Column + "]";
        }
    }
}
