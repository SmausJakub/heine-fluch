package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.compiler.symbol.SymbolTable;
import cz.zcu.kiv.fjp.compiler.types.Goto;
import cz.zcu.kiv.fjp.enums.ProgramMode;
import cz.zcu.kiv.fjp.errors.ErrorHandler;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Compiler Data - data used by compilers to compile given file
 */
public final class CompilerData {

    /**
     * minimal INT declaration of stack
     */
    public static final int MIN_DECLARATION = 3;

    /**
     * Program mode
     */
    public static ProgramMode programMode;

    /**
     * symbol table
     */
    public static SymbolTable symbolTable = SymbolTable.getInstance();

    /**
     * current address where values are stored in stack
     */
    public static int currentAddress = 3;

    /**
     * current level in which the program currently is
     */
    public static int currentLevel = 0;

    /**
     * number of declarations which use address
     */
    public static int declarationCounter = 0;

    /**
     * instruction list
     */
    public static List<Instruction> instructionList = new ArrayList<>();


    /**
     * goto list - for gotos that do not know the address when compiled
     */
    public static List<Goto> gotoList = new ArrayList<>();

    public static ErrorHandler err = ErrorHandler.getInstance();

    private CompilerData() {
    }


    /**
     * Checks if a given identifier has a corresponding item in symbol table
     * @param identifier identifier
     * @return true or false
     * @see #checkIfCanBeAccessed(String)
     */
    public static boolean checkIfExists(String identifier) {

        return symbolTable.contains(identifier);
    }

    /**
     * Checks if an item given by the identifier name can be accessed, meaning if his level is less than or equal to current level
     * it is presumed that the item exists in symbol table
     * @param identifier identifier
     * @return true or false
     * @see #checkIfExists(String)
     */
    public static boolean checkIfCanBeAccessed(String identifier) {
        return symbolTable.getItem(identifier).getLevel() <= currentLevel;
    }


    /**
     * Sorts the instruction list by indexes of instructions
     */
    public static void sortList() {

        Collections.sort(instructionList);

    }

    /**
     * Gives index to each instruction based on their position in the list
     */
    public static void indexList() {

        for (int i = 0; i < instructionList.size(); i++) {
            instructionList.get(i).setIndex(i);
        }

    }

    /**
     * Prints instruction list in a readable and usable format (for interpret)
     * @return printed instruction list
     */
    public static String printInstructionList() {
        StringBuilder builder = new StringBuilder();

        for (Instruction ins : instructionList) {
            builder.append(ins.toString());
        }

        return builder.toString();
    }

}
