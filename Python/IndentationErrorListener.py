##
## Project      : an ErrorListener class to collect and display indentation errors
##

from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

class IndentationErrorListener(ErrorListener):
    _errorList = []

    @staticmethod
    def lexerError(msg: str):
        IndentationErrorListener._errorList.append(msg)

    def syntaxError(self, recognizer
                  , offendingSymbol
                  , line: int, charPositionInLine: int
                  , msg: str
                  , e: RecognitionException):

        startOfMessage = " line " + str(line) + ":\t "

##      ************************************************************
##      *** Not exact matches! This is only for a demonstration. ***
##      ************************************************************
        if msg.startswith("missing INDENT at "):
            IndentationErrorListener._errorList.append(startOfMessage + "expected an indented block")
        elif msg.startswith("mismatched input '<INDENT>") or \
             msg.startswith("extraneous input '<INDENT>"):

            IndentationErrorListener._errorList.append(startOfMessage + "unexpected indent")

    @staticmethod
    def displayErrors():
       if len(IndentationErrorListener._errorList) > 0:
            errors = "\nINDENTATION ERROR:\n" + "\n".join(IndentationErrorListener._errorList)
            print(errors)
