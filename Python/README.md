### Command line example:
```bash
antlr4 -Dlanguage=Python3 PythonLexer.g4
antlr4 -Dlanguage=Python3 PythonParser.g4
pygrun --tokens Python file_input test.py
pygrun --tree Python file_input test.py
```
