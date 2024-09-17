import 'package:antlr4/antlr4.dart';

abstract class PythonParserBase extends Parser {
  PythonParserBase(TokenStream input) : super(input);

  // https://docs.python.org/3/reference/lexical_analysis.html#soft-keywords
  bool isEqualToCurrentTokenText(String tokenText) {
    return this.currentToken.text == tokenText;
  }

  bool isnotEqualToCurrentTokenText(String tokenText) {
    return !this.isEqualToCurrentTokenText(tokenText); // for compatibility with the Python 'not' logical operator
  }
}
