package cz.zcu.kiv.fjp.compiler.compilers;


import cz.zcu.kiv.fjp.Pascal0LikeLexer;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.compiler.visitors.VisitorProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Compiler {

    private static Compiler INSTANCE = new Compiler();

    private Compiler() {
    }

    public static Compiler getInstance() {
        return INSTANCE;
    }

    /**
     * @param inputFile
     * @param outputFile
     * @throws IOException
     */
    public void compileFile(String inputFile, String outputFile) throws IOException {

        CharStream inputStream = CharStreams.fromFileName(inputFile);

        Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Pascal0LikeParser parser = new Pascal0LikeParser(tokens);
        ParseTree tree = parser.program();

        Program program = new VisitorProgram().visit(tree);
        new CompilerProgram(program).compileProgram();

    }


}
