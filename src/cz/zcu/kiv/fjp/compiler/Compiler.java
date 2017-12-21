package cz.zcu.kiv.fjp.compiler;

import cz.zcu.kiv.fjp.Pascal0LikeLexer;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.compiler.compilers.CompilerProgram;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.compiler.visitors.VisitorProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Compiler {

    private static final Compiler INSTANCE = new Compiler();

    private Compiler() {
    }

    public static Compiler getInstance() {
        return INSTANCE;
    }

    public void compileFile(String inputFile, String outputFile) throws IOException {

        CharStream inputStream = CharStreams.fromFileName(inputFile);

        Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);

        ParserErrorListener parserErrorListener = new ParserErrorListener();

        lexer.removeErrorListeners();
        lexer.addErrorListener(parserErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Pascal0LikeParser parser = new Pascal0LikeParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);

        ParseTree tree = parser.program();

        // visitor
        Program program = new VisitorProgram().visit(tree);

        // compiler
        new CompilerProgram(program).compileProgram();

    }


}
