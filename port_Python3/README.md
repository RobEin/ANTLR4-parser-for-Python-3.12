### Python 3

#### Command line example for node.js:
- first copy the two grammar files and the example.py to this directory and run the transformGrammar.py file

Unix:
```bash
    cp ../*.g4 .
    cp ../example.py .
    python transformGrammar.py
```

Windows:
```bash
    copy ..\*.g4
    copy ..\example.py
    python transformGrammar.py
```

```bash
antlr4 -Dlanguage=Python3 PythonLexer.g4
antlr4 -Dlanguage=Python3 PythonParser.g4
pygrun --tokens Python file_input example.py
pygrun --tree Python file_input example.py
```

#### Related link:
[Python target](https://github.com/antlr/antlr4/blob/master/doc/python-target.md)

[ANTLR4 Python 3 runtime](https://pypi.org/project/antlr4-python3-runtime/)
