using Antlr4.Runtime;
using System;

[assembly: CLSCompliant(false)]

namespace grun_tokens
{
    static class Program
    {
        static void Main(string[] args)
        {
            var input = CharStreams.fromPath(args[0]); // default command line argument: ..\..\..\test.py
            var lexer = new PythonLexer(input);
            var tokens = new CommonTokenStream(lexer);
            var parser = new PythonParser(tokens);

            tokens.Fill();
            foreach (IToken t in tokens.GetTokens())
            {
                Console.WriteLine(GetTokenMetaDataWithRuleName(parser, t));
            }

            parser.file_input();
        }

        private static string GetTokenMetaDataWithRuleName(PythonParser parser, IToken token)
        {
            String metaData = token.ToString()!;          // original format: [@TokenIndex,startIndex:stopIndex='text',<TokenType>,line:charPositionInLine]
            int lesserPos = metaData.LastIndexOf(",<");
            int greaterPos = metaData.LastIndexOf(">,");
            return metaData.Substring(0, lesserPos + 2) + // modified format: [@TokenIndex,startIndex:stopIndex='text',<TokenName>,line:charPositionInLine]
                    parser.Vocabulary.GetSymbolicName(token.Type) +
                    metaData.Substring(greaterPos);
        }
    }
}
