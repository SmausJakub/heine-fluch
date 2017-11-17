package cz.zcu.kiv.fjp.compiler.instruction;

public class Instruction {

    private String instruction;
    private String name;


    public Instruction(String instruction, String name) {
        this.instruction = instruction;
        this.name = name;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Instruction: " + this.instruction + ", name: " + this.name + "\n";
    }

}
