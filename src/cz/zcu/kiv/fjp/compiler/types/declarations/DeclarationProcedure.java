package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Procedure;
import cz.zcu.kiv.fjp.enums.DeclarationType;

public class DeclarationProcedure extends AbstractDeclaration {

    private Block procedureBlock;

    private Procedure procedure;

    public DeclarationProcedure(Procedure procedure, Block procedureBlock, int line) {
        super(DeclarationType.PROCEDURE, line);
        this.procedure = procedure;
        this.procedureBlock = procedureBlock;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public Block getProcedureBlock() {
        return procedureBlock;
    }

    @Override
    public String toString() {
        return "PROCEDURE " + procedure.toString() + ";";
    }

}
