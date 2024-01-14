import antlr4 from "antlr4";
import PythonLexer from "./PythonLexer.js";
import PythonParser from "./PythonParser.js";

function getTokenMetaDataWithTokenName(token) {
    const tokenText = token.text.replaceAll("\r", "\\r").replaceAll("\n", "\\n");
    const tokenName = token.type == -1 ? "EOF" : parser.symbolicNames[token.type];
    const optionalChannel = token.channel == 0 ? "" : "channel=" + token.channel + ",";

    //      [@tokenIndex,start:stop='tokenText',<tokenName>,channel=channel,line:column]
    return "[@" + token.tokenIndex + "," + token.start + ":" + token.stop + "='" + tokenText + "',<" + tokenName + ">," + optionalChannel + token.line + ":" + token.column + "]";
}

const input = antlr4.CharStreams.fromPathSync(process.argv[2]);
const lexer = new PythonLexer(input);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new PythonParser(tokens);

tokens.fill();
for (const token of tokens.tokens) {
    console.log(getTokenMetaDataWithTokenName(token));
}
const tree = parser.file_input();
