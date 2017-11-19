package cz.zcu.kiv.fjp.instruction;


import cz.zcu.kiv.fjp.enums.InstructionCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstructionHandler {

    private static InstructionHandler instance = new InstructionHandler();

    private int instructionNumber = 0;

    private InstructionHandler() {
    }

    public static InstructionHandler getInstance() {
        return instance;
    }

    public Instruction createJumpInstruction(int level, int index) {
        return new Instruction(instructionNumber++, InstructionCode.JMP.getName(), level, index);
    }

    public Instruction createIntInstruction(int level, int constant) {
        return new Instruction(instructionNumber++, InstructionCode.INT.getName(), level, constant);
    }

    public Instruction createRetInstruction() {
        return new Instruction(instructionNumber++, InstructionCode.RET.getName(), 0, 0);
    }



    private Instruction parseInstruction(String input) {


        // TODO kontrola argumentu

        String[] ins = input.split("\\s+");

        int index = Integer.parseInt(ins[0]);
        String insCode = ins[1];
        int level = Integer.parseInt(ins[2]);
        int operand = Integer.parseInt(ins[3]);

        return new Instruction(index, insCode, level, operand);

    }

    public List<Instruction> parseFile(File file) throws IOException {

        List<Instruction> list = new ArrayList<cz.zcu.kiv.fjp.instruction.Instruction>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Instruction i = parseInstruction(line);
            list.add(i);
        }

        fileReader.close();

        return list;

    }


}
