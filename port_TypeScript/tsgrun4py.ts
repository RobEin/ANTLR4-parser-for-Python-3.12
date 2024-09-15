import { CharStreams, CommonTokenStream, Token } from "antlr4";
import PythonLexer from "./PythonLexer";
import PythonParser from "./PythonParser";

function getTokenMetaDataWithTokenName(token: Token): string {
    const tokenText = token.toString();
    const tokenName = token.type == Token.EOF ? "EOF" : parser.symbolicNames[token.type] ?? "";
    const channelText = token.channel == Token.DEFAULT_CHANNEL ? "" : "channel=" + token.channel + ",";

    // original format: [@tokenIndex,start:stop='tokenText',<tokenType>,channel=channel,line:column]
    // modified format: [@tokenIndex,start:stop='tokenText',<tokenName>,channel=channel,line:column]
    return "[@" + token.tokenIndex + "," + token.start + ":" + token.stop + "='" + tokenText + "',<" + tokenName + ">," + channelText + token.line + ":" + token.column + "]";
}

const input = CharStreams.fromPathSync(process.argv[2], "UTF8");
const lexer = new PythonLexer(input);
const tokens = new CommonTokenStream(lexer);
const parser = new PythonParser(tokens);

tokens.fill();
for (const token of tokens.tokens) {
    console.log(getTokenMetaDataWithTokenName(token));
}

const tree = parser.file_input();
