import 'package:antlr4/antlr4.dart';
import 'PythonLexer.dart';
import 'PythonParser.dart';
import 'dart:io';

void main(List<String> args) async {
  if (args.isEmpty) {
    print('Usage: dart main.dart <path_to_file>');
    exit(1);
  }

  final input = await File(args[0]).readAsString();
  final inputStream = InputStream.fromString(input);
  final lexer = PythonLexer(inputStream);
  final tokens = CommonTokenStream(lexer);
  final parser = PythonParser(tokens);

  tokens.fill();
  final tokenList = tokens.getTokens();

  if (tokenList != null) {
    for (final token in tokenList) {
      print(getTokenMetaDataWithTokenName(parser, token));
    }
  } else {
    print('No tokens found.');
  }

  parser.file_input();
}

String getTokenMetaDataWithTokenName(PythonParser parser, Token token) {
  final tokenText = token.toString();
  final tokenName = token.type == Token.EOF ? "EOF" : parser.vocabulary.getDisplayName(token.type);
  final channelText = token.channel == Token.DEFAULT_CHANNEL ? "" : "channel=" + token.channel.toString() + ",";

  // original format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenType>,channel=Channel,Line:Column]
  // modified format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=Channel,Line:Column]
  return "[@" + token.tokenIndex.toString() + "," + token.startIndex.toString() + ":" + token.stopIndex.toString() + "='" + tokenText + "',<" + tokenName + ">," + channelText + token.line.toString() + ":" + token.charPositionInLine.toString() + "]";
}
