from antlr4 import InputStream, Parser, Token
from typing import TextIO
from IndentationErrorListener import IndentationErrorListener
import sys

class PythonParserBase(Parser):
    def __init__(self, input: InputStream, output: TextIO = sys.stdout):
        super().__init__(input, output)
        self._isMatchedEOF = False
        #self.removeErrorListeners()
        self.addErrorListener(IndentationErrorListener())

    def isCurrentTokenType1(self, type1: int) -> bool:
        currentTokenType = self.getCurrentToken().type
        return currentTokenType == type1

    def isCurrentTokenType2(self, type1: int, type2: int) -> bool:
        currentTokenType = self.getCurrentToken().type
        return currentTokenType == type1 \
            or currentTokenType == type2

    def isCurrentTokenType3(self, type1: int, type2: int, type3: int) -> bool:
        currentTokenType = self.getCurrentToken().type
        return currentTokenType == type1 \
            or currentTokenType == type2 \
            or currentTokenType == type3

    def isnotCurrentTokenType1(self, type1: int) -> bool:
        return not self.isCurrentTokenType1(type1)

    def isnotCurrentTokenType2(self, type1: int, type2: int) -> bool:
        return not self.isCurrentTokenType2(type1, type2)

    def isnotCurrentTokenType3(self, type1: int, type2: int, type3: int) -> bool:
        return not self.isCurrentTokenType3(type1, type2, type3)

    def isTokenTypeSequence(self, type1: int, type2: int) -> bool:
        return self._input.LA(1) == type1 \
           and self._input.LA(2) == type2

    def isCurrentTokenText(self, tokenText: str) -> bool:
        return self.getCurrentToken().text == tokenText

    def isnotCurrentTokenText(self, tokenText: str) -> bool:
        return not self.isCurrentTokenText(tokenText)

    def exitRule(self):
        super().exitRule()
        if self.getCurrentToken().type == Token.EOF and self._isMatchedEOF == False:
            self._isMatchedEOF = True
            IndentationErrorListener.displayErrors()
