### C# target

#### Command line example:
- first create a C# project called grun_tokens then copy the two grammar files and test.py to this directory
```bash
    dotnet new console -o . -n grun_tokens -f netcoreapp3.1
    del program.cs
    dotnet add package Antlr4.Runtime.Standard --version 4.13.1
```

```bash
    copy ..\*.g4
    copy ..\examples\test.py
```

```bash
antlr4 -Dlanguage=CSharp PythonLexer.g4
antlr4 -Dlanguage=CSharp PythonParser.g4
dotnet build
dotnet run test.py --no-build
```

#### Related links:
[C# target](https://github.com/antlr/antlr4/blob/dev/doc/csharp-target.md)

[Download .NET](https://dotnet.microsoft.com/en-us/download)

[Antlr4 Standard Runtime](https://www.nuget.org/packages/Antlr4.Runtime.Standard/)
