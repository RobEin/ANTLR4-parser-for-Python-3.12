#!/usr/bin/env python3

# ******* GRUN (Grammar Unit Test) for Python *******
from antlr4 import *
from PythonLexer import PythonLexer
from PythonParser import PythonParser
import sys
import re
from typing import IO, Optional

def replace_special_characters(text: str) -> str:
    return text.replace('\n', r'\n') \
               .replace('\r', r'\r') \
               .replace('\t', r'\t') \
               .replace('\f', r'\f')

def get_token_metadata_with_token_name(token: Token) -> str:
    token_text = replace_special_characters(token.text)
    token_name = "EOF" if token.type == Token.EOF else PythonLexer.symbolicNames[token.type]
    channel_text = "" if token.channel == Token.DEFAULT_CHANNEL else \
                  f"channel={PythonLexer.channelNames[token.channel]},"

    # Modified format: [@TokenIndex,StartIndex:StopIndex='Text',<TokenName>,channel=channelName,Line:Column]
    return (f"[@{token.tokenIndex},{token.start}:{token.stop}='{token_text}',<{token_name}>,{channel_text}{token.line}:{token.column}]")

def get_encoded_input_stream_by_python_comment(file_path: str) -> FileStream:
    encoding_name: str = ""
    ws_comment_pattern: re.Pattern = re.compile(r"^[ \t\f]*(#.*)?$")

    try:
        file: IO[bytes]
        with open(file_path, 'rb') as file:  # read in binary mode
            for _ in range(2): # only the first two lines
                line: str = file.readline().decode('ascii', errors='ignore')
                if not line:  
                    break # EOF reached

                line = line.replace('\r', '').replace('\n', '')
                if ws_comment_pattern.match(line):  # WS* + COMMENT? found
                    encoding_name = get_encoding_name(line)
                    if encoding_name:
                        break # encoding found
                else:
                    break  # statement or backslash found (line is not empty, not whitespace(s), not a comment)
    except Exception as e:
        # print(f"An error occurred: {e}")
        pass

    DEFAULT_PYTHON_ENCODING = "utf-8" # default encoding for Python source code 
    if not encoding_name:
        encoding_name = DEFAULT_PYTHON_ENCODING

    try: # encoding test for ANTLR4
        return FileStream(file_path, encoding_name)
    except Exception as e:
        return FileStream(file_path, DEFAULT_PYTHON_ENCODING)

def get_encoding_name(comment_text: str) -> str: # https://peps.python.org/pep-0263/#defining-the-encoding
    encoding_comment_pattern: str = r"^[ \t\f]*#.*?coding[:=][ \t]*([-_.a-zA-Z0-9]+)"
    match: Optional[re.Match] = re.search(encoding_comment_pattern, comment_text)
    if match:
        encoding_name: str  = match.group(1)

        # normalize encoding name
        encoding_map: dict[str, str] = {
            "cp1252": "latin1",
            "latin-1": "latin1",
            "iso-8859-1": "latin1"
            # more encoding pairs
        }
        return encoding_map.get(encoding_name.lower(), encoding_name)
    return ""


def main() -> int:
    try:
        if len(sys.argv) < 2:
            print("Error: Please provide an input file path")
            return 1

        file_path: str = sys.argv[1]
        input_stream: FileStream = get_encoded_input_stream_by_python_comment(file_path)
        lexer: PythonLexer = PythonLexer(input_stream)
        token_stream: CommonTokenStream = CommonTokenStream(lexer)
        parser: PythonParser = PythonParser(token_stream)

        token_stream.fill()
        for token in token_stream.tokens:
            print(get_token_metadata_with_token_name(token))
        
        parser.file_input()
        return parser.getNumberOfSyntaxErrors()
    except Exception as ex:
        print(f"Error: {str(ex)}", file=sys.stderr)
        return 1  # Error occurred, returning non-zero exit code

if __name__ == '__main__':
    sys.exit(main())
