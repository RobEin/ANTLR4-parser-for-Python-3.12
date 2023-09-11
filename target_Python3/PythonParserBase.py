from antlr4 import InputStream, Parser, Token
from typing import TextIO
import sys

class PythonParserBase(Parser):
    def __init__(self, input: InputStream, output: TextIO = sys.stdout):
        super().__init__(input, output)
        self._isMatchedEOF = False

    def isEqualCurrentTokenText(self, tokenText: str) -> bool:
        return self.getCurrentToken().text == tokenText

    def isnotEqualCurrentTokenText(self, tokenText: str) -> bool:
        return not self.isEqualCurrentTokenText(tokenText)

    def exitRule(self):
        super().exitRule()
        if self.getCurrentToken().type == Token.EOF and \
           self._isMatchedEOF == False:

            self._isMatchedEOF = True
