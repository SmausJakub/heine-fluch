package cz.zcu.kiv.fjp.interpret;


import cz.zcu.kiv.fjp.errors.ErrorHandler;
import cz.zcu.kiv.fjp.errors.ErrorProgramCounter;
import cz.zcu.kiv.fjp.errors.ErrorUnknownInstruction;
import cz.zcu.kiv.fjp.instruction.Instruction;
import cz.zcu.kiv.fjp.instruction.InstructionHandler;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Interpreter
 * Interprets instructions made from Pascal0Like language
 */
public class Interpreter {

    private static final Interpreter INSTANCE = new Interpreter();

    private Interpreter() {
    }

    public static Interpreter getInstance() {
        return INSTANCE;
    }

    private Stack stack = new Stack(1, 0);
    private List<Integer> heap = new ArrayList<Integer>();

    private int programCounter;                 // Citac instrukci
    private InstructionHandler instructionHandler;
    private List<Instruction> instructionsList;
    private Instruction instruction;
    private Scanner sc = new Scanner(System.in);

    public static ErrorHandler err = ErrorHandler.getInstance();

    /**
     * Interprets instructions in a file
     * @param instructions
     * @param printStack
     * @throws Exception
     */
    public void interpret(File instructions, boolean printStack, String stackFile) throws Exception {

        instructionHandler = InstructionHandler.getInstance();

        instructionsList = instructionHandler.parseFile(instructions);

        final int STACK_SIZE = stack.getStackItems().length;
        int value1, value2, returnIntValue, address;

        float returnFloatValue, valueFloat1, valueFloat2;

        programCounter = 0;
        System.out.println("START PascaL/0-like");
        do {
            if (programCounter < 0 || programCounter > STACK_SIZE) {
                err.throwError(new ErrorProgramCounter(), programCounter);
            }

            instruction = instructionsList.get(programCounter);

            programCounter++;

            switch (instruction.getInstructionCode()) {

                case "LIT":
                    stack.push(instruction.getOperand());
                    break;
                case "LRT":
                    stack.floatPush(instruction.getFloatOperand());
                    break;
                case "OPR":
                    switch (instruction.getOperand()) {
                        case 1:    // NEG
                            value1 = stack.pop();
                            stack.push(-value1);
                            break;
                        case 2:    // ADD
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 + value2);
                            break;
                        case 3:    // SUB
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 - value2);
                            break;
                        case 4:    // MUL
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 * value2);
                            break;
                        case 5:    // DIV
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 / value2);
                            break;
                        case 6:    // MOD
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 % value2);
                            break;
                        case 7:    // ODD
                            value1 = stack.pop();
                            stack.push(value1 % 2);
                            break;
                        case 8:    // EQ
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 == value2 ? 1 : 0);
                            break;
                        case 9:    // NE
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 != value2 ? 1 : 0);
                            break;
                        case 10:   // LT
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 < value2 ? 1 : 0);
                            break;
                        case 11:   // GE
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 >= value2 ? 1 : 0);
                            break;
                        case 12:   // GT
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 > value2 ? 1 : 0);
                            break;
                        case 13:   // LE
                            value2 = stack.pop();
                            value1 = stack.pop();
                            stack.push(value1 <= value2 ? 1 : 0);
                            break;
                    }
                    break;
                case "LOD":
                    value1 = stack.getValue(instruction.getOperand() + stack.getBaseOfItem(instruction.getLevel()));
                    stack.push(value1);
                    break;
                case "STO":
                    value1 = stack.pop();
                    stack.setValue(instruction.getOperand() + stack.getBaseOfItem(instruction.getLevel()), value1);
                    break;
                case "LOR":
                    valueFloat1 = stack.getFloatValue(instruction.getOperand() + stack.getBaseOfItem(instruction.getLevel()));
                    stack.floatPush(valueFloat1);
                    break;
                case "STR":
                    valueFloat1 = stack.floatPop();
                    stack.setFloatValue(instruction.getOperand() + stack.getBaseOfItem(instruction.getLevel()), valueFloat1);
                    break;
                case "CAL":
                    stack.setValue(stack.getTop() + 1, stack.getBaseOfItem(instruction.getLevel()));
                    stack.setValue(stack.getTop() + 2, stack.getBase());
                    stack.setValue(stack.getTop() + 3, programCounter);
                    stack.setBase(stack.getTop() + 1);
                    programCounter = instruction.getOperand();
                    break;
                case "RET":
                    stack.setTop(stack.getBase() - 1);
                    programCounter = stack.getValue(stack.getTop() + 3);
                    stack.setBase(stack.getValue(stack.getTop() + 2));
                    break;
                case "INT":
                    stack.increaseTop(instruction.getOperand());
                    break;
                case "JMP":
                    programCounter = instruction.getOperand();
                    break;
                case "JMC":
                    if (stack.getValue(stack.getTop()) == 0) {
                        programCounter = instruction.getOperand();
                    }
                    stack.reduceTop(1);
                    break;
                case "REA":
                    stack.push(sc.nextInt());
                    break;
                case "WRI":
                    System.out.println("" + stack.pop());
                    break;
                case "RER":
                    stack.floatPush(sc.nextFloat());
                    break;
                case "WRR":
                    System.out.println("" + stack.floatPop());
                    break;
                case "OPF":
                    switch (instruction.getOperand()) {
                        case 1:  // NEG
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = -valueFloat1;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 2:  // ADD
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 + valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 3:  // SUB
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 - valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 4:  // MUL
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 * valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 5:  // DIV
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = valueFloat1 / valueFloat2;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 6:  // MOD
                            err.throwError(new ErrorUnknownInstruction(), instruction);
                        case 7:  // ODD
                            err.throwError(new ErrorUnknownInstruction(), instruction);
                        case 8:  // EQ
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 == valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 9:  // NE
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 != valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 10:  // LT
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 < valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 11: // GE
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 >= valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 12: // GT
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 > valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                        case 13: // LE
                            valueFloat2 = stack.floatPop();
                            valueFloat1 = stack.floatPop();
                            returnFloatValue = (valueFloat1 <= valueFloat2) ? 1 : 0;
                            stack.floatPush(returnFloatValue);
                            break;
                    }
                    break;
                case "RTI":
                    valueFloat1 = stack.floatPop();
                    returnIntValue = (int) valueFloat1;
                    stack.push(returnIntValue);
                    break;
                case "ITR":
                    value1 = stack.pop();
                    returnFloatValue = value1;
                    stack.floatPush(returnFloatValue);
                    break;
                case "NEW":
                    heap.add(0);
                    stack.push(heap.size() -1);
                    break;
                case "DEL":
                    heap.remove(heap.size() -1);
                    stack.push(heap.size());
                    break;
                case "LDA":
                    address = stack.pop();
                    returnIntValue = heap.get(address);
                    stack.push(returnIntValue);
                    break;
                case "STA":
                    address = stack.pop();
                    value1 = stack.pop();
                    heap.set(address, value1);
                    break;
                case "PLD":
                    value1 = stack.getValue(stack.top() + stack.getBaseOfItem(stack.getValue(stack.getTop() - 1)));
                    stack.pop();
                    stack.setValue(stack.getTop(), value1);
                    break;
                case "PST":
                    value1 = stack.getValue(stack.getBaseOfItem(stack.getValue(stack.getTop()))) + stack.top() + 1;
                    stack.pop();
                    stack.pop();
                    stack.setValue(value1, stack.getValue(stack.getTop()));
                    stack.reduceTop(1);
                    break;
                default:
                    System.out.println("End of instructions or unknown instruction.");
                    break;
            }

        } while (programCounter != 0);

        System.out.println("END PascaL/0-like");

            if (printStack) {
                if (stackFile != null) {
                    PrintWriter pw;
                    System.out.println("Writing stack into " + stackFile);
                    pw = new PrintWriter(stackFile);
                    pw.print(Arrays.toString(stack.getStackItems()));
                    pw.close();
                } else {
                    System.out.println("Konecny zasobnik prekladace:\n" + Arrays.toString(stack.getStackItems()));
                }
            }

    }

}