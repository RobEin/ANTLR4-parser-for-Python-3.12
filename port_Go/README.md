### Go port

This Go port cannot be used with ANTLR 4.13.2 at this time (Sept. 2024). 
The necessary Go [runtime modification](https://github.com/antlr/antlr4/pull/4626) is awaiting for a review.
It will probably be merged in the next ANTLR4 version.
In the meantime, anyone who needs it can modify their local runtime based on [this](https://github.com/antlr/antlr4/pull/4626/commits/735cfcb21a25b7eacd0b06cd3307f4281c76edf3) and [this](https://github.com/antlr/antlr4/pull/4626/commits/5b9c537649f80d149d3613fb29eb69f3923fd64f).

#### Prerequisites:
- Installed [ANTLR4-tools](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#getting-started-the-easy-way-using-antlr4-tools)
- Installed [Dart](https://dart.dev/get-dart)
- Installed [Python 3](https://www.python.org/downloads/)

#### Command line example:
    first:
     - create the go.mod file
     - download the ANTLR4 package
     - copy the two grammar files and the example.py to this directory
     - run the transformGrammar.py to modify the grammars for the Go target

```bash
    go mod init GoLang
    go get github.com/antlr4-go/antlr
``` 

Unix:
```bash
    cp ../*.g4 ./parser
    cp ../example.py .
    python ./parser/transformGrammar.py
```

Windows:
```bash
    copy ..\*.g4 .\parser
    copy ..\example.py
    python .\parser\transformGrammar.py
```

```bash
go generate ./...
go mod tidy
go run grun4py.go example.py
```

#### Related links:
 - [Go target](https://github.com/antlr/antlr4/blob/dev/doc/go-target.md)
 - [ANTLR4 parser for Python 3.8.20 with Go target](https://github.com/RobEin/ANTLR4-parser-for-Python-3.8/tree/main/port_Go)
 - [ANTLR4 parser for Python 2.7.18 with Go target](https://github.com/RobEin/ANTLR4-parser-for-Python-2.7.18/tree/main/port_Go)
 - [Tiny Python with Go target](https://github.com/RobEin/tiny-python/tree/master/port_Go)
 