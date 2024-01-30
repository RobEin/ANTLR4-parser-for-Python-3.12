### C# implementation

#### Prerequisites:
- Installed [ANTLR4-tools](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#getting-started-the-easy-way-using-antlr4-tools)
- Installed [.NET Framework](https://dotnet.microsoft.com/en-us/download/dotnet-framework)
 

#### Command line example for Windows:
 - first create a C# project called csgrun4py then copy the two grammar files and example.py to this directory:
```bash
    dotnet new console -o . -n csgrun4py -f netcoreapp3.1
    del program.cs
    dotnet add package Antlr4.Runtime.Standard --version 4.13.1
```

```bash
    copy ..\*.g4
    copy ..\example.py
```

```bash
antlr4 -Dlanguage=CSharp PythonLexer.g4
antlr4 -Dlanguage=CSharp PythonParser.g4
dotnet build
dotnet run example.py --no-build
```


#### Related link:
[C# target](https://github.com/antlr/antlr4/blob/dev/doc/csharp-target.md)
