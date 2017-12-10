package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.compiler.symbol.SymbolTable;
import cz.zcu.kiv.fjp.errors.ErrorHandler;
import cz.zcu.kiv.fjp.instruction.Instruction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CompilerData {

    public static final int MIN_DECLARATION = 3;
    public static SymbolTable symbolTable = SymbolTable.getInstance();

    public static int currentAddress = 3;

    public static int currentLevel = 0;

    public static int declarationCounter = 0;
    public static List<Instruction> instructionList = new ArrayList<>();
    public static ErrorHandler err = new ErrorHandler();

    private CompilerData() {
    }

    public static List<Instruction> sortList() {

        Collections.sort(instructionList);

        return instructionList;

    }

    public static List<Instruction> indexList() {

        for (int i = 0; i < instructionList.size(); i++) {
            instructionList.get(i).setIndex(i);
        }

        return instructionList;

    }

}
