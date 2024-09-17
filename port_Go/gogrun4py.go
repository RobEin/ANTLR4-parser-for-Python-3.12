package main

import (
	// py_parser "GoLang/parser"
	"GoLang/parser"
	"fmt"
	"os"

	"github.com/antlr4-go/antlr/v4"
)

func getTokenMetaData(p antlr.Parser, t antlr.Token) string {
	var tokenName string
	if t.GetTokenType() == antlr.TokenEOF {
		tokenName = "EOF"
	} else {
		tokenName = p.GetSymbolicNames()[t.GetTokenType()]
	}

	var channelText string
	if t.GetChannel() == antlr.TokenDefaultChannel {
		channelText = ""
	} else {
		channelText = fmt.Sprint("channel=", t.GetChannel(), ",")
	}

	// original format: [@tokenIndex,start:stop='tokenText',<tokenType>,channel=channel,line:column]
	// modified format: [@tokenIndex,start:stop='tokenText',<tokenName>,channel=channel,line:column]
	return fmt.Sprint("[@", t.GetTokenIndex(), ",", t.GetStart(), ":", t.GetStop(), "='", t.String(), "',<", tokenName, ">,", channelText, t.GetLine(), ":", t.GetColumn(), "]")
}

func main() {
	pyInput, _ := antlr.NewFileStream(os.Args[1])
	pyLexer := parser.NewPythonLexer(pyInput)
	pyTokens := antlr.NewCommonTokenStream(pyLexer, antlr.TokenDefaultChannel)
	pyParser := parser.NewPythonParser(pyTokens)

	pyTokens.Fill()
	for _, t := range pyTokens.GetAllTokens() {
		fmt.Println(getTokenMetaData(pyParser, t))
	}

	pyParser.File_input()
}
