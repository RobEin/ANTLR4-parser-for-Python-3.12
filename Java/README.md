### Command line example:
- first of all copy the two grammar files and the test.py to this directory

Unix:
```bash
    cp ../*.g4 .
    cp ../test.py .
```

Windows:
```bash
    copy ..\*.g4
    copy ..\test.py
```

```bash
antlr4 PythonLexer.g4
antlr4 PythonParser.g4
javac *.java
grun Python file -tokens test.py
grun Python file -gui test.py
```
