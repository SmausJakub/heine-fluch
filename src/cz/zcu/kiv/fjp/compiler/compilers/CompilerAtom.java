package cz.zcu.kiv.fjp.compiler.compilers;

import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.compiler.symbol.SymbolTableItem;
import cz.zcu.kiv.fjp.compiler.types.atoms.*;
import cz.zcu.kiv.fjp.enums.InstructionCode;
import cz.zcu.kiv.fjp.instruction.Instruction;

import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.instructionList;
import static cz.zcu.kiv.fjp.compiler.compilers.CompilerData.symbolTable;

public class CompilerAtom {


    private AbstractAtom atom;

    public CompilerAtom(AbstractAtom atom) {
        this.atom = atom;
    }

    public void compileAtom() {
        switch (atom.getAtomType()) {

            case INT:

                AtomInteger atomInteger = (AtomInteger) atom;

                instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, atomInteger.getInteger()));
                break;
            case REAL:

                AtomReal atomReal = (AtomReal) atom;

                instructionList.add(new Instruction(InstructionCode.LRT.getName(), 0, atomReal.getReal()));

                break;
            case BOOLEAN:
                AtomBoolean atomBoolean = (AtomBoolean) atom;

                int val = atomBoolean.isBool() ? 1 : 0;

                instructionList.add(new Instruction(InstructionCode.LIT.getName(), 0, val));
                break;
            case ID:

                AtomId atomId = (AtomId) atom;
                SymbolTableItem item = symbolTable.getItem(atomId.getIdentifier());

                instructionList.add(new Instruction(InstructionCode.LOD.getName(), item.getLevel(), item.getAddress()));
                break;
            case STRING:

                AtomString atomString = (AtomString) atom;

                break;
        }
    }

}
