# ANTLR4 Python 3.10.2 parser &nbsp; [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

An ANTLR4 parser for Python 3.10.2 based on the official [Python PEG grammar](https://docs.python.org/3.10/reference/grammar.html).

#### A simple usage:
```bash
antlr4 PythonLexer.g4
antlr4 PythonParser.g4
javac *.java
grun Python file -tokens test.py
```
