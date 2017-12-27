package cz.zcu.kiv.fjp.compiler;

import cz.zcu.kiv.fjp.Pascal0LikeLexer;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.compiler.compilers.CompilerProgram;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTable;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.compiler.visitors.VisitorProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.printInstructionList;

/**
 * Compiler class
 * Compiles input file, writes the output to output file
 * Depending on options, prints symbol table to console or a file
 */
public class Compiler {

    private static final Compiler INSTANCE = new Compiler();

    private Compiler() {
    }

    public static Compiler getInstance() {
        return INSTANCE;
    }

    /**
     * compiles given file and prints the output to output file. Supports printing symbol table to console or a file.
     *
     * @param inputFile   source code of Pascal0Like
     * @param outputFile  output file of instructions
     * @param printSymbol whether to print a symbol table
     * @param symbolFile  file for printed symbol table
     */
    public void compileFile(String inputFile, String outputFile, boolean printSymbol, String symbolFile) {


        System.out.println("Starting up compiler ....");
        System.out.println("Loading source code from file " + inputFile);

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(inputFile);
        } catch (IOException e) {
            System.err.println("Error while loading file " + inputFile);
            System.exit(0);
        }

        System.out.println("OK");

        Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);

        ParserErrorListener parserErrorListener = new ParserErrorListener();

        lexer.removeErrorListeners();
        lexer.addErrorListener(parserErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Pascal0LikeParser parser = new Pascal0LikeParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);

        System.out.println("ANTLR parsing tree ...");

        ParseTree tree = parser.program();

        System.out.println("OK");

        System.out.println("Visitor visiting tree ...");

        // visitor
        Program program = new VisitorProgram().visit(tree);

        System.out.println("OK");
        System.out.println("Compiler compiling tree using the " + program.getProgramMode().toString() + " mode");

        // compiler
        new CompilerProgram(program).compileProgram();

        System.out.println("OK");

        System.out.println("Writing output instructions into " + outputFile);

        try {
            PrintWriter pw = new PrintWriter(outputFile);

            pw.print(printInstructionList());

            if (printSymbol) {
                if (symbolFile != null) {
                    pw.close();
                    System.out.println("Writing symbol table into " + symbolFile);
                    pw = new PrintWriter(symbolFile);
                    pw.print(SymbolTable.getInstance().printSymbolTable());
                } else {
                    System.out.println("Symbol Table:\n" + SymbolTable.getInstance().printSymbolTable());
                }
            }

            pw.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error while writing into files");
            System.exit(0);
        }

        System.out.println("Done");

    }


}
