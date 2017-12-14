package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.atoms.*;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.instruction.Instruction;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.instructionList;
import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.symbolTable;

/**
 * Atom Compiler
 * Compiles atoms into instructions
 */
public class CompilerAtom {


    /**
     * atom to compile
     */
    private AbstractAtom atom;

    /**
     * @param atom atom to compile
     */
    public CompilerAtom(AbstractAtom atom) {
        this.atom = atom;
    }

    public void compileAtom() {
        switch (atom.getAtomType()) {

            case INT:
                // integer - simply load constant to stack using LIT

                AtomInteger atomInteger = (AtomInteger) atom;

                instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, atomInteger.getInteger()));
                break;
            case REAL:
                // real - load constant to stack using LRT

                AtomReal atomReal = (AtomReal) atom;

                instructionList.add(new Instruction(InstructionCode.LRT.getName(), 0, atomReal.getReal()));

                break;
            case BOOLEAN:
                // determine if true (1) or false (0) and LIT

                AtomBoolean atomBoolean = (AtomBoolean) atom;

                int val = atomBoolean.isBool() ? 1 : 0;

                instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, val));
                break;
            case ID:
                // need to find the item we are supposed to load

                AtomId atomId = (AtomId) atom;
                SymbolTableItem item = symbolTable.getItem(atomId.getIdentifier());

                // switch its type
                switch (item.getVariableType()) {

                    case INTEGER:
                        // loading integer with LOD
                        instructionList.add(new Instruction(InstructionCode.LOD.getName(), item.getLevel(), item.getAddress()));
                        break;
                    case REAL:
                        // loading real with LOR
                        instructionList.add(new Instruction(InstructionCode.LOR.getName(), item.getLevel(), item.getAddress()));
                        break;
                    case STRING:
                        break;
                    case BOOLEAN:
                        // loading bool with LOD
                        instructionList.add(new Instruction(InstructionCode.LOD.getName(), item.getLevel(), item.getAddress()));
                        break;
                }
                break;
            case STRING:

                AtomString atomString = (AtomString) atom;

                break;
        }
    }

}
