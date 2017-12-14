package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.compiler.types.Procedure;
import cz.zcu.kiv.fjp.enums.DeclarationType;

/**
 * Declaration of a procedure
 */
public class DeclarationProcedure extends AbstractDeclaration {

    /**
     * procedure block
     */
    private Block procedureBlock;

    /**
     * procedure
     */
    private Procedure procedure;

    /**
     * @param procedure      procedure
     * @param procedureBlock procedure block
     * @param line           line number
     */
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
