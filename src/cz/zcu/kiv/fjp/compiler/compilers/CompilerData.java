package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.compiler.symbol.SymbolTable;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.errors.ErrorHandler;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public final class CompilerData {

    // minimal INT declaration of stack
    public static final int MIN_DECLARATION = 3;

    // symbol table
    public static SymbolTable symbolTable = SymbolTable.getInstance();

    // current address where values are stored in stack
    public static int currentAddress = 3;

    // current level where the program is
    public static int currentLevel = 0;

    // number of declarations per procedure / main
    public static int declarationCounter = 0;

    // list of instructions
    public static List<Instruction> instructionList = new ArrayList<>();

    // error handler
    public static ErrorHandler err = new ErrorHandler();

    // goto list - for later declared labels
    public static List<Goto> gotoList = new ArrayList<>();


    private CompilerData() {
    }


    /**
     * @param identifier
     * @return
     */
    public static boolean checkIfExists(String identifier) {

        return symbolTable.contains(identifier);
    }

    /**
     *
     * @param identifier
     * @return
     */
    public static boolean checkIfCanBeAccessed(String identifier) {
        return symbolTable.getItem(identifier).getLevel() <= currentLevel;
    }

    /**
     *
     */
    public static void sortList() {

        Collections.sort(instructionList);

    }

    /**
     *
     */
    public static void indexList() {

        for (int i = 0; i < instructionList.size(); i++) {
            instructionList.get(i).setIndex(i);
        }

    }

    /**
     * @return
     */
    public static String printInstructionList() {
        StringBuilder builder = new StringBuilder();

        for (Instruction ins : instructionList) {
            builder.append(ins.toString());
        }

        return builder.toString();
    }

}
