### C# target

#### Command line example:
- first create a C# project called grun_tokens then copy the two grammar files and test.py to this directory
```bash
    dotnet new console -o . -n grun_tokens -f net7.0
    del program.cs
    dotnet add package Antlr4.Runtime.Standard --version 4.13.1
```

```bash
    copy ..\*.g4
    copy ..\test.py
```

```bash
antlr4 -Dlanguage=CSharp PythonLexer.g4
antlr4 -Dlanguage=CSharp PythonParser.g4
dotnet build
.\bin\Debug\net7.0\grun_tokens.exe test.py
```

#### Related link:
[C# target](https://github.com/antlr/antlr4/blob/dev/doc/csharp-target.md)

[Download .NET](https://dotnet.microsoft.com/en-us/download)

[Antlr4 Standard Runtime](https://www.nuget.org/packages/Antlr4.Runtime.Standard/)
