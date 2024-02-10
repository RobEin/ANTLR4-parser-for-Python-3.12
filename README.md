# ANTLR4 parser for Python 3.12.2 &nbsp; [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

### About files:
 - PythonParser.g4
   is the ANTLR4 parser grammar that based on the official [Python PEG grammar](https://docs.python.org/3.12/reference/grammar.html)

 - PythonLexerBase
   handles the Python indentations

- Example files: [Python 3.12 Standard Lib](https://github.com/python/cpython/tree/3.12/Lib)

<br/><br/>
### Known issue:
The parsing of type comments is currently not supported.\
However, if the type comments appear only at the related statements in the Python code then the parsing of type comments can be used with the following modified [lexer](https://github.com/RobEin/ANTLR4-parser-for-Python-3.12/blob/main/PythonLexer.g4) rule:
```
TYPE_COMMENT: '#' WS? 'type:' ~[\r\n]*;
```
related discussion:\
[Deprecate type comment support?](https://github.com/python/mypy/issues/12947)

<br/><br/> 
### Related links:
[ANTLR 4](https://www.antlr.org/)

[ANTLR4-tools](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#getting-started-the-easy-way-using-antlr4-tools)

[ANTLR 4 Documentation](https://github.com/antlr/antlr4/tree/master/doc)

[ANTLR 4 Runtime API](https://www.antlr.org/api/Java/)

[Python 3.12 Lexical Analysis](https://docs.python.org/3.12/reference/lexical_analysis.html)

[cpython](https://github.com/python/cpython)

[ANTLR4 parser for Python 2.7.18](https://github.com/RobEin/ANTLR4-parser-for-Python-2.7.18)

[ANTLR4 parser for Python 3.8](https://github.com/RobEin/ANTLR4-parser-for-Python-3.8.12)
