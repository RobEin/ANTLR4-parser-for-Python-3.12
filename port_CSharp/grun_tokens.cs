using Antlr4.Runtime;
using System;

[assembly: CLSCompliant(false)]

namespace grun_tokens
{
    static class Program
    {
        static void Main(string[] args)
        {
            var input = CharStreams.fromPath(args[0]); // default command line argument for IDE: ..\..\..\test.py
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
            String metaData = token.ToString()!;          // original format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenType>,channel=Channel,Line:Column]
            int lesserPos = metaData.LastIndexOf(",<");
            int greaterPos = metaData.LastIndexOf(">,");
            return metaData.Substring(0, lesserPos + 2) // modified format:   [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=Channel,Line:Column]
                 + parser.Vocabulary.GetSymbolicName(token.Type)
                 + metaData.Substring(greaterPos);

        }
    }
}
