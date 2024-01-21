### JavaScript implementation

#### Prerequisites:
- Installed [ANTLR4-tools](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#getting-started-the-easy-way-using-antlr4-tools)
- Installed [Node.js](https://www.python.org/downloads/)
 

#### Command line example for Node.js:
- first download the necessary node modules and set the ```type``` field in the ```package.json``` then copy the two grammar files and example.py to this directory:
```bash
    npm install antlr4
    npm install --save-dev webpack
    npm pkg set type=module
```

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
