package cz.zcu.kiv.fjp;


import cz.zcu.kiv.fjp.compiler.Compiler;
import cz.zcu.kiv.fjp.interpret.Interpreter;

import java.io.File;

public class Main {

    private static void usage() {

        System.out.println("PascaL0-like prekladac a interpret");
        System.out.println("Pouziti:");
        System.out.println("-h : zobraz napovedu");
        System.out.println("-c [vstupni soubor] [vystupni soubor] -s [symbol table soubor]: Prelozi vstupni soubor zdrojoveho kodu PascaL/0-like do instrukci jazyka PascaL0-Like. Dalsi parametry jsou dobrovolne. -s vypisuje tabulku symbolu na obrazovku, ctvrty parametr oznacuje soubor, do ktereho se tabulka symbolu ulozi.");
        System.out.println("-i [soubor] -s [zasobnik soubor]: Interpretace instrukci PascaL/0-like. Dalsi parametry jsou dobrovolne. -s vypisuje konecnou podobu zasobniku na obrazovku, treti parametr oznacuje soubor, do ktereho se zasobnik ulozi.");

    }

    public static void main(String[] args) throws Exception{

        String command;
        String inputFile;
        String outputFile;
        String symbolTableFile;
        String stackFile;

        File instructionsFile;

        if(args.length > 0) {

            command = args[0];

            if (command.equalsIgnoreCase("-h")) {

                // help
                usage();
            } else if (command.equalsIgnoreCase("-c")) {

                // compiler

                if (args.length > 2) {

                    inputFile = args[1];
                    outputFile = args[2];

                    if (args.length > 3) {

                        if (args[3].equalsIgnoreCase("-s")) {

                            if (args.length > 4) {

                                symbolTableFile = args[4];

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

            } else if (command.equalsIgnoreCase("-i")) {
                // interpret
                try {
                    if (args.length > 1) {

                        inputFile = args[1];
                        instructionsFile = new File(inputFile);
                        if (args.length > 2) {

                            if (args[2].equalsIgnoreCase("-s")) {

                                if (args.length > 3) {

                                    stackFile = args[3];

                                    Interpreter.getInstance().interpret(instructionsFile, true, stackFile);

                                } else {
                                    Interpreter.getInstance().interpret(instructionsFile, true, null);
                                }

                            } else {
                                System.err.println("Neznamy argument. Vypisuji pouziti.");
                                usage();
                            }
                        } else {
                            Interpreter.getInstance().interpret(instructionsFile, false, null);
                        }
                    } else {
                        System.err.println("Spatne zadane parametry.");
                        usage();
                    }
                } catch (Exception e) {
                         System.out.println(e);
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
