package parser

import "github.com/antlr4-go/antlr/v4"

type PythonParserBase struct {
	*antlr.BaseParser
}

func NewPythonParserBase(input antlr.TokenStream) *PythonParserBase {
	ppb := new(PythonParserBase)
	ppb.BaseParser = antlr.NewBaseParser(input)
	return ppb
}

func (prs *PythonParserBase) isEqualToCurrentTokenText(tokenText string) bool {
	return prs.GetCurrentToken().GetText() == tokenText
}

func (prs *PythonParserBase) isnotEqualToCurrentTokenText(tokenText string) bool {
	return !prs.isEqualToCurrentTokenText(tokenText)
}
