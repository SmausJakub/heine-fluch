package cz.zcu.kiv.fjp.compiler;

public class InstructionHandler {

    private InstructionHandler instance = new InstructionHandler();

    private InstructionHandler() {
    }

    public InstructionHandler getInstance() {
        return instance;
    }

    public Instruction parseInstruction(String input) {


        // TODO kontrola argumentu

        String[] ins = input.split("\\s+");

        int index = Integer.parseInt(ins[0]);
        String insCode = ins[1];
        int level = Integer.parseInt(ins[2]);
        int operand = Integer.parseInt(ins[3]);

        return new Instruction(index, insCode, level, operand);

    }


}
