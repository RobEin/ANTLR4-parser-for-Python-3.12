### JavaScript

#### Command line example for node.js:
- first copy the two grammar files and the example.py to this directory

Unix:
```bash
    cp ../*.g4 .
    cp ../example.py .
```

Windows:
```bash
    copy ..\*.g4
    copy ..\example.py
```

```bash
antlr4 -Dlanguage=JavaScript PythonLexer.g4
antlr4 -Dlanguage=JavaScript PythonParser.g4
node grun_tokens.js example.py
```

#### Related link:
[JavaScript target](https://github.com/antlr/antlr4/blob/dev/doc/javascript-target.md)
