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
        System.out.println("-c [vstupni soubor] [vystupni soubor] -s [symbol table soubor]: Prelozi vstupni soubor zdrojoveho kodu PascaL0-like do instrukci jazyka PascaL0-Like. Dalsi parametry jsou dobrovolne. -st vypisuje tabulku symbolu na obrazovku, ctctvrty parametr oznacuje soubor, do ktereho se tabulka symbolu ulozi.");
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

                    if (args.length > 3) {

                        if (args[3].equalsIgnoreCase("-s")) {

                            if (args.length > 4) {

                                String symbolTableFile = args[4];

                                Compiler.getInstance().compileFile(inputFile, outputFile, true, symbolTableFile);


                            } else {
                                Compiler.getInstance().compileFile(inputFile, outputFile, true, null);
                            }

                        } else {
                            System.err.println("Neznamy argument. Vypisuji pouziti.");
                            usage();
                        }

                    } else {
                        Compiler.getInstance().compileFile(inputFile, outputFile, false, null);
                    }

                } else {
                    System.err.println("Spatne zadane parametry.");
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
                    System.err.println("Nezadan nazev souboru.");
                }

            } else {
                System.err.println("Neznamy argument. Vypisuji pouziti.");
                usage();
            }




        }else {
            usage();
        }

    }

}
