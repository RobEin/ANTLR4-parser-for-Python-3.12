# ANTLR4 parser for Python 3.10.2 &nbsp; [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

### About files:
 - PythonParser.g4
   is the ANTLR4 parser grammar that based on the official [Python PEG grammar](https://docs.python.org/3.10/reference/grammar.html).

 - PythonLexerBase.java
   handles the Python indentations.
   This class also can be used with older ANTLR4 Python grammars.
   See the instructions in the comments.

 - PythonParserBase.java
   is a helper class to implement [PEG grammar specific expressions](https://www.python.org/dev/peps/pep-0617/#grammar-expressions) in an ANTLR4 parser grammar 
   with [semantic predicates](https://github.com/antlr/antlr4/blob/master/doc/predicates.md).


### A simple usage example in command line:
```bash
antlr4 PythonLexer.g4
antlr4 PythonParser.g4
javac *.java
grun Python file -tokens test.py
```


### Known issues:
  - slow parser


### Related links:
[ANTLR 4](https://www.antlr.org/)

[ANTLR 4 Documentation](https://github.com/antlr/antlr4/tree/master/doc)

[ANTLR 4 Runtime API](https://www.antlr.org/api/Java/)

[Python 3 Lexical Analysis](https://docs.python.org/3/reference/lexical_analysis.html)

[cpython](https://github.com/python/cpython)
