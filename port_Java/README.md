### Java 8

#### Command line example:
- first copy the two grammar files and the test.py to this directory

Unix:
```bash
    cp ../*.g4 .
    cp ../examples/test.py .
```

Windows:
```bash
    copy ..\*.g4
    copy ..\examples\test.py
```

```bash
antlr4 PythonLexer.g4
antlr4 PythonParser.g4
javac *.java
grun Python file_input -tokens test.py
grun Python file_input -gui test.py
```

#### Related link:
[Java target](https://github.com/antlr/antlr4/blob/master/doc/java-target.md)
