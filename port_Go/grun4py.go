// ******* GRUN (Grammar Unit Test) for Python *******

package main

import (
	// py_parser "GoLang/parser"
	"GoLang/parser"
	"bufio"
	"bytes"
	"fmt"
	"os"
	"regexp"
	"strings"

	"github.com/antlr4-go/antlr/v4"
)

func main() {
	if len(os.Args) < 2 {
		fmt.Fprintln(os.Stderr, "Please provide a file path as an argument")
		os.Exit(1)
	}

	filePath := os.Args[1]

	// Try to parse the input file
	if err := parseFile(filePath); err != nil {
		fmt.Fprintln(os.Stderr, "Error:", err)
		os.Exit(1)
	}

	fmt.Println("Program successfully executed")
}

// parseFile parses the file using the generated lexer and parser
func parseFile(filePath string) error {
	encodingName := getEncodingNameFromPythonComment(filePath)

	fmt.Println("***************************")
	fmt.Println(encodingName)
	fmt.Println("***************************")

	input, err := antlr.NewFileStream(filePath, encodingName)
	if err != nil {
		return fmt.Errorf("failed to open file: %v", err)
	}

	// Create the lexer and token stream
	lexer := parser.NewPythonLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	parser := parser.NewPythonParser(tokens)

	tokens.Fill() // Test the lexer grammar
	for _, token := range tokens.GetAllTokens() {
		fmt.Println(getTokenMetaDataWithTokenName(lexer, token))
	}

	parser.File_input() // Test the parser grammar

	if parser.GetNumberOfSyntaxErrors() > 0 {
		return fmt.Errorf("parsing completed with error(s)")
	}

	return nil
}

// getTokenMetaDataWithTokenName formats the token information
func getTokenMetaDataWithTokenName(lexer antlr.Lexer, token antlr.Token) string {
	tokenText := token.GetText()
	tokenName := lexer.GetSymbolicNames()[token.GetTokenType()]
	if token.GetTokenType() == antlr.TokenEOF {
		tokenName = "EOF"
	}
	channelText := ""
	if token.GetChannel() != antlr.TokenDefaultChannel {
		channelText = fmt.Sprintf("channel=%d,", token.GetChannel())
	}

	return fmt.Sprintf("[@%d,%d:%d='%s',<%s>,%s%d:%d]",
		token.GetTokenIndex(),
		token.GetStart(),
		token.GetStop(),
		tokenText,
		tokenName,
		channelText,
		token.GetLine(),
		token.GetColumn(),
	)
}

func getEncodingNameFromPythonComment(filePath string) string {
	var encodingName string = ""
	ws_commentPattern := regexp.MustCompile(`^[ \t\f]*(#.*)?$`)

	file, err := os.Open(filePath)
	if err != nil {
		fmt.Printf("An error occurred: %v\n", err)
		return "utf-8" // default Python source code encoding
	}
	defer file.Close()

	reader := bufio.NewReader(file)

	for i := 0; i < 2; i++ { // only the first two lines
		lineBytes, err := reader.ReadBytes('\n')
		if err != nil { // EOF or other errors
			break
		}

		// decode line to ASCII, ignoring invalid characters
		line := string(bytes.Map(func(r rune) rune {
			if r > 127 {
				return -1 // remove non-ASCII characters
			}
			return r
		}, lineBytes))

		line = strings.ReplaceAll(line, "\r", "")
		line = strings.ReplaceAll(line, "\n", "")

		if ws_commentPattern.MatchString(line) { // WS* + COMMENT? found
			encodingName = getEncodingName(line)
			if encodingName != "" {
				break // encoding found
			}
		} else {
			break // statement or backslash found (line is not empty, not whitespace(s), not comment)
		}
	}

	if encodingName == "" {
		encodingName = "utf-8" // default Python source code encoding
	}
	return encodingName
}

func getEncodingName(commentText string) string {
	encodingCommentPattern := regexp.MustCompile(`^[ \t\f]*#.*?coding[:=][ \t]*([-_.a-zA-Z0-9]+)`)
	match := encodingCommentPattern.FindStringSubmatch(commentText)

	if match != nil {
		encodingName := match[1]

		// normalize encoding name
		encodingMap := map[string]string{
			"cp1252":     "latin1",
			"latin-1":    "latin1",
			"iso-8859-1": "latin1",
			// more encoding pairs if needed
		}

		if normalized, exists := encodingMap[strings.ToLower(encodingName)]; exists {
			return normalized
		}
		return encodingName
	}
	return ""
}
