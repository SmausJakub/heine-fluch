package cz.zcu.kiv.fjp;


import cz.zcu.kiv.fjp.compiler.Compiler;
import cz.zcu.kiv.fjp.interpret.Interpreter;

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

                    Compiler.getInstance().compileFile(args[1], args[2]);

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
