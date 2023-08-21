from antlr4 import Parser, Token, InputStream
from typing import TextIO
from IndentationErrorListener import IndentationErrorListener
import sys


class PythonParserBase(Parser):
    def __init__(self, input: InputStream, output: TextIO = sys.stdout):
        super().__init__(input, output)
        self._isMatchedEOF = False
        #self.removeErrorListeners()
        self.addErrorListener(IndentationErrorListener())

    def exitRule(self):
        super().exitRule()
        if self.getCurrentToken().type == Token.EOF and self._isMatchedEOF == False:
            self._isMatchedEOF = True
            IndentationErrorListener.displayErrors()
