package cz.zcu.kiv.fjp;


import cz.zcu.kiv.fjp.compiler.visitors.VisitorExpression;
import cz.zcu.kiv.fjp.compiler.visitors.VisitorProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    private static String inputFile;

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

            if (command.equalsIgnoreCase("-h") == true) {

                // help
                usage();
            } else if (command.equalsIgnoreCase("-c")) {

                // compiler

                if (args.length > 1) {

                    inputFile = args[1];
                    CharStream inputStream = CharStreams.fromFileName(inputFile);

                    Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    Pascal0LikeParser parser = new Pascal0LikeParser(tokens);
                    ParseTree tree = parser.program();
                    VisitorProgram visitor = new VisitorProgram();
                    visitor.visit(tree);

                } else {
                    System.out.println("Nezadan nazev souboru.");
                }

            } else if (command.equalsIgnoreCase("-l")) {

                // interpret
            } else {
                System.out.println("Neznamy argument. Vypisuji pouziti.");
                usage();
            }




        }else {
            usage();
        }

    }

}
