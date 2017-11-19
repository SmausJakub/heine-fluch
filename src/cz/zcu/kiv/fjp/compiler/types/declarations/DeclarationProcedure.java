package cz.zcu.kiv.fjp.compiler.types.declarations;

import cz.zcu.kiv.fjp.abstracts.AbstractDeclaration;
import cz.zcu.kiv.fjp.compiler.types.Block;
import cz.zcu.kiv.fjp.enums.DeclarationType;

public class DeclarationProcedure extends AbstractDeclaration {

    private String identifier;
    private Block procedureBlock;


    public DeclarationProcedure() {
        super(DeclarationType.PROCEDURE);
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Block getProcedureBlock() {
        return procedureBlock;
    }

    public void setProcedureBlock(Block procedureBlock) {
        this.procedureBlock = procedureBlock;
    }
}
