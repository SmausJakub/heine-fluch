package cz.zcu.kiv.fjp;


import cz.zcu.kiv.fjp.compiler.compilers.CompilerProgram;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.compiler.visitors.VisitorProgram;
import cz.zcu.kiv.fjp.interpret.Interpreter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class Main {

    private static String inputFile;
    private static File instructionsFile;

    private static void usage() {

        System.out.println("PascaL0-like prekladac a interpret");
        System.out.println("Pouziti:");
        System.out.println("-h : zobraz napovedu");
        System.out.println("-c [vstupni soubor] [vystupni soubor] : preloz vstupni soubor jazyka PascaL0-like do vystupniho souboru");
        System.out.println("-i [soubor] : interpretuj instrukce PL/0");

    }

    public static void main(String[] args) throws Exception{

        if(args.length > 0) {

            String command = args[0];

            if (command.equalsIgnoreCase("-h")) {

                // help
                usage();
            } else if (command.equalsIgnoreCase("-c")) {

                // compiler

                if (args.length > 2) {

                    String inputFile = args[1];
                    String outputFile = args[2];

                    CharStream inputStream = CharStreams.fromFileName(inputFile);

                    Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    Pascal0LikeParser parser = new Pascal0LikeParser(tokens);
                    ParseTree tree = parser.program();

                    // visitor
                    Program program = new VisitorProgram().visit(tree);

                    // compiler
                    new CompilerProgram(program).compileProgram();

                } else {
                    System.out.println("Spatne zadane parametry.");
                    usage();
                }

            } else if (command.equalsIgnoreCase("-l")) {

                // interpret

                if (args.length > 1) {

                    inputFile = args[1];
                    instructionsFile = new File(inputFile);



                    Interpreter interpreter = new Interpreter();

                 //   try {
                       interpreter.interpret(instructionsFile);
               //     } catch (Exception e) {
               //         System.out.println(e);
               //     }


                } else {
                    System.out.println("Nezadan nazev souboru.");
                }

            } else {
                System.out.println("Neznamy argument. Vypisuji pouziti.");
                usage();
            }




        }else {
            usage();
        }

    }

}
