package cz.zcu.kiv.fjp.compiler.instruction;

import java.util.HashMap;

public class InstructionMap {

    private InstructionMap() {}

    private static HashMap<Instruction, Integer> instructionMap;

    public static HashMap<Instruction, Integer> getInstructionMap() {
        return instructionMap;
    }


    static {

        instructionMap = new HashMap<Instruction, Integer>();

        int i = 0;
        instructionMap.put(new Instruction("null", "nulsym"), ++i);
        instructionMap.put(new Instruction("ident", "identsym"), ++i);
        instructionMap.put(new Instruction("int", "intsym"), ++i);
        instructionMap.put(new Instruction("double", "doublesym"), ++i);
        instructionMap.put(new Instruction("bool", "boolsym"), ++i);
        instructionMap.put(new Instruction("str", "strsym"), ++i);
        instructionMap.put(new Instruction("+", "plussym"), ++i);
        instructionMap.put(new Instruction("-", "minussym"), ++i);
        instructionMap.put(new Instruction("*", "multsym"), ++i);
        instructionMap.put(new Instruction("/", "slashsym"), ++i);
        instructionMap.put(new Instruction("=", "eqlsym"), ++i);
        instructionMap.put(new Instruction("<>", "neqsym"), ++i);
        instructionMap.put(new Instruction("<", "lessym"), ++i);
        instructionMap.put(new Instruction("<=", "leqsym"), ++i);
        instructionMap.put(new Instruction(">", "gtrsym"), ++i);
        instructionMap.put(new Instruction(">=", "geqsym"), ++i);
        instructionMap.put(new Instruction("(", "lparentsym"), ++i);
        instructionMap.put(new Instruction(")", "rparentsym"), ++i);
        instructionMap.put(new Instruction("[", "lbracksym"), ++i);
        instructionMap.put(new Instruction("]", "rbracksym"), ++i);
        instructionMap.put(new Instruction(",", "commasym"), ++i);
        instructionMap.put(new Instruction(";", "semicolomsym"), ++i);
        instructionMap.put(new Instruction(".", "periodsym"), ++i);
        instructionMap.put(new Instruction(":=", "assignsym"), ++i);
        instructionMap.put(new Instruction("!", "negatesym"), ++i);
        instructionMap.put(new Instruction("?", "ternaryonesym"), ++i);
        instructionMap.put(new Instruction(":", "ternarytwosym"), ++i);
        instructionMap.put(new Instruction("begin", "beginsym"), ++i);
        instructionMap.put(new Instruction("end", "endsym"), ++i);
        instructionMap.put(new Instruction("if", "ifsym"), ++i);
        instructionMap.put(new Instruction("then", "thensym"), ++i);
        instructionMap.put(new Instruction("while", "whilesym"), ++i);
        instructionMap.put(new Instruction("do", "dosym"), ++i);
        instructionMap.put(new Instruction("repeat", "repeatsym"), ++i);
        instructionMap.put(new Instruction("until", "untilsym"), ++i);
        instructionMap.put(new Instruction("call", "callsym"), ++i);
        instructionMap.put(new Instruction("const", "constsym"), ++i);
        instructionMap.put(new Instruction("integer", "integersym"), ++i);
        instructionMap.put(new Instruction("boolean", "booleansym"), ++i);
        instructionMap.put(new Instruction("real", "realsym"), ++i);
        instructionMap.put(new Instruction("string", "stringsym"), ++i);
        instructionMap.put(new Instruction("procedure", "proceduresym"), ++i);
        instructionMap.put(new Instruction("else", "elsesym"), ++i);
        instructionMap.put(new Instruction("label", "labesym"), ++i);
        instructionMap.put(new Instruction("goto", "gotosym"), ++i);
        instructionMap.put(new Instruction("read", "readsym"), ++i);
        instructionMap.put(new Instruction("write", "writesym"), ++i);
        instructionMap.put(new Instruction("case", "casesym"), ++i);
        instructionMap.put(new Instruction("of", "ofsym"), ++i);
        instructionMap.put(new Instruction("for", "forsym"), ++i);
        instructionMap.put(new Instruction("to", "tosym"), ++i);
        instructionMap.put(new Instruction("downto", "downtosym"), ++i);
        instructionMap.put(new Instruction("and", "andsym"), ++i);
        instructionMap.put(new Instruction("or", "orsym"), ++i);


    }
}
