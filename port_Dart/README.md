### Dart port

This Dart target cannot be used with ANTLR 4.13.2 at this time (Sept. 2024). 
The necessary Dart [runtime modification](https://github.com/antlr/antlr4/pull/4646) is awaiting for a review.
It will probably be merged in the next ANTLR4 version. 
In the meantime, anyone who needs it can modify their local runtime based on [this](https://github.com/antlr/antlr4/pull/4646/commits/72a760f13d29fa95c0dde22137c6e025795b6498).

#### Command line example:
First download the dependencies then copy the two grammar files and the example.py to the current bin directory:
```bash
    dart pub get
    cd bin
```
Unix:
```bash
    cp ../../*.g4 .
    cp ../../example.py .
```
Windows:
```bash
    copy ..\..\*.g4
    copy ..\..\example.py
```
```bash
antlr4 -Dlanguage=Dart PythonLexer.g4
antlr4 -Dlanguage=Dart PythonParser.g4
dart dartgrun4py.dart example.py
```

#### Related links:
 - [Dart target](https://github.com/antlr/antlr4/blob/dev/doc/dart-target.md)
 - [ANTLR4 parser for Python 3.8.20 with Dart target](https://github.com/RobEin/ANTLR4-parser-for-Python-3.8/tree/main/port_Dart)
 - [ANTLR4 parser for Python 2.7.18 with Dart target](https://github.com/RobEin/ANTLR4-parser-for-Python-2.7.18/tree/main/port_Dart)
 - [Tiny Python with Dart target](https://github.com/RobEin/tiny-python/tree/master/port_Dart)
 