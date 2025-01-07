// ******* GRUN (Grammar Unit Test) for Python *******

import * as fs from 'fs';
import { CharStreams, CommonTokenStream, Token } from "antlr4";
import PythonLexer from "./PythonLexer.js";
import PythonParser from "./PythonParser.js";

class grun4py {
    static replaceSpecialCharacters(text) {
        return text.replace(/\n/g, "\\n")
                   .replace(/\r/g, "\\r")
                   .replace(/\t/g, "\\t")
                   .replace(/\f/g, "\\f");
    
    }
    
    static getTokenMetaDataWithTokenName(token) {
        const tokenText = this.replaceSpecialCharacters(token.text);
        const tokenName = token.type == Token.EOF ? "EOF" : PythonLexer.symbolicNames[token.type] ?? "";
        const channelText = token.channel == Token.DEFAULT_CHANNEL ?
            "" :
            `channel=${PythonLexer.channelNames[token.channel]},`;
    
        // original format: [@tokenIndex,start:stop='tokenText',<tokenType>,channel=channelNumber,line:column]
        // modified format: [@tokenIndex,start:stop='tokenText',<tokenName>,channel=channelName,line:column]
        return `[@${token.tokenIndex},${token.start}:${token.stop}='${tokenText}',<${tokenName}>,${channelText}${token.line}:${token.column}]`;
    }
    
    static async getEncodedInputStreamByPythonComment(filePath) {
        let encodingName = "";
        const ws_commentPattern = /^[ \t\f]*(#.*)?$/;
    
        try {
            const data = fs.readFileSync(filePath, { encoding: 'ascii' }); // read in binary mode
            const lines = data.split('\n');
    
            for (let lineCount = 0; lineCount < 2; lineCount++) { // only the first two lines
                let line = lines[lineCount];
                if (line === undefined) {
                    break; // EOF reached
                }
    
                line = line.replace('\r', '');
                if (ws_commentPattern.test(line)) { // WS* + COMMENT? found
                    encodingName = this.getEncodingName(line);
                    if (encodingName) {
                        break; // encoding found
                    }
                } else {
                    break; // statement or backslash found (line is not empty, not whitespace(s), not comment)
                }
            }
        } catch (error) {
            // console.error("An error occurred: " + error);
        }
    
        const DEFAULT_PYTHON_ENCODING = "utf-8"; // default encoding for Python source code 
        if (!encodingName) {
            encodingName = DEFAULT_PYTHON_ENCODING;
        }
    
        try { // encoding test for ANTLR4
            return CharStreams.fromPathSync(filePath, encodingName);
        } catch (error) {
            return CharStreams.fromPathSync(filePath, DEFAULT_PYTHON_ENCODING)
        }
    }
    
    static getEncodingName(commentText) { // https://peps.python.org/pep-0263/#defining-the-encoding
        const encodingCommentPattern = /^[ \t\f]*#.*?coding[:=][ \t]*([-_.a-zA-Z0-9]+)/;
        const match = commentText.match(encodingCommentPattern);
        if (match) {
            const encodingName = match[1];
    
            // normalize encoding name
            const encodingMap = {
                "cp1252": "latin1",
                "latin-1": "latin1",
                "iso-8859-1": "latin1"
                // more encoding pairs
            };
    
            return encodingMap[encodingName.toLowerCase()] || encodingName;
        }
        return "";
    }
    
    static async main(filePath) {
        if (process.argv.length < 3) {
            console.error('Error: Please provide an input file path');
            process.exit(1);
        }
        
        try {
            const input = await this.getEncodedInputStreamByPythonComment(filePath);
            const lexer = new PythonLexer(input);
            const tokens = new CommonTokenStream(lexer);
            const parser = new PythonParser(tokens);
        
            tokens.fill(); // Test the lexer grammar
            for (const token of tokens.tokens) {
                console.log(this.getTokenMetaDataWithTokenName(token));
            }
        
            parser.file_input(); // Test the parser grammar
            process.exit(parser.syntaxErrorsCount);
        } catch (error) {
            if (error instanceof Error) {
                console.error(`Error:\n${error.message}`);
            } else {
                console.error('An unknown error occurred');
            }
            process.exit(1);
        }
    }
}

grun4py.main(process.argv[2]);