// ******* GRUN (Grammar Unit Test) for Python *******

import 'package:antlr4/antlr4.dart';
import 'PythonLexer.dart';
import 'PythonParser.dart';
import 'dart:io';
import 'dart:convert';

void main(List<String> args) async {
  if (args.isEmpty) {
    print('Please provide a file path as an argument');
    exit(1);
  }

  try {
    final String filePath = args[0];
    final String encodingName = await getEncodingNameFromPythonComment(filePath);

    
    print("*****************************");
    print(encodingName);
    print("*****************************");


    final Encoding encoding = getEncodingFromName(encodingName);
    final String input = await File(filePath).readAsString(encoding: encoding);
    final inputStream = InputStream.fromString(input);
    final lexer = PythonLexer(inputStream);
    final tokens = CommonTokenStream(lexer);
    final parser = PythonParser(tokens);

    tokens.fill(); // Test the lexer grammar
    for (var token in tokens.getTokens()!) {
      print(getTokenMetaDataWithTokenName(lexer, token));
    }

    parser.file_input(); // Test the parser grammar
    if (parser.numberOfSyntaxErrors > 0) {
      stderr.writeln('Parsing completed with error(s).');
      exit(1);
    }
  }  catch (e) {
    stderr.writeln('Error: $e');
    exit(1);
  }

  exit(0); // Program successfully executed
}

String getTokenMetaDataWithTokenName(PythonLexer lexer, Token token) {
  final tokenName = token.type == Token.EOF ? "EOF" : lexer.vocabulary.getDisplayName(token.type);
  final channelText = token.channel == Token.DEFAULT_CHANNEL ? "" : "channel=" + token.channel.toString() + ",";

  // original format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenType>,channel=Channel,Line:Column]
  // modified format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=Channel,Line:Column]
  return '[@${token.tokenIndex},${token.startIndex}:${token.stopIndex}="${token.text}",<$tokenName>,$channelText${token.line}:${token.charPositionInLine}]';
}

Future<String> getEncodingNameFromPythonComment(String filePath) async {
  String encodingName = "";
  final RegExp ws_commentPattern = RegExp(r'^[ \t\f]*(#.*)?$');

  try {
    final File file = File(filePath);
    final List<String> lines = await file.openRead() // read in binary mode
        .transform(utf8.decoder)
        .transform(LineSplitter())
        .take(2)
        .toList(); // read only the first two lines

    for (final String line in lines) {
      String processedLine = line.replaceAll('\r', '').replaceAll('\n', '');
      if (ws_commentPattern.hasMatch(processedLine)) {
        encodingName = getEncodingName(processedLine);
        if (encodingName.isNotEmpty) {
          break; // encoding found
        }
      } else {
        break; // statement or backslash found (line is not empty, not whitespace(s), not comment)
      }
    }
  } catch (e) {
    print('An error occurred: $e');
  }

  if (encodingName.isEmpty) {
    encodingName = "utf-8"; // default Python source code encoding
  }
  return encodingName;
}

String getEncodingName(String commentText) {
  final RegExp encodingCommentPattern = RegExp(r'^[ \t\f]*#.*?coding[:=][ \t]*([-_.a-zA-Z0-9]+)');
  final RegExpMatch? match = encodingCommentPattern.firstMatch(commentText);

  if (match != null) {
    final String encodingName = match.group(1)!;

    // normalize encoding name
    final Map<String, String> encodingMap = {
      "cp1252": "latin1",
      "latin-1": "latin1",
      "iso-8859-1": "latin1"
      // add more encoding pairs here
    };

    return encodingMap[encodingName.toLowerCase()] ?? encodingName;
  }
  return "";
}

Encoding getEncodingFromName(String encodingName) {
  switch (encodingName.toLowerCase()) {
    case 'latin1':
      return latin1;
    case 'utf-8':
      return utf8;
    default:
      throw Exception('Unsupported encoding: $encodingName');
  }
}