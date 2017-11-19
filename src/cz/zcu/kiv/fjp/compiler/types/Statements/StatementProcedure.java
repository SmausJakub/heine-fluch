package cz.zcu.kiv.fjp.compiler.types.Statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementProcedure extends AbstractStatement {

    private String identifier;

    public StatementProcedure() {
        super(StatementType.PROCEDURE);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
