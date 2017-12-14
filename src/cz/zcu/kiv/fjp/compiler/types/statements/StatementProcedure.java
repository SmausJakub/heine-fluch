package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementProcedure extends AbstractStatement {


    private String identifier;

    public StatementProcedure(String identifier, int line) {
        super(StatementType.PROCEDURE, line);
        this.identifier = identifier;
    }


    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append("CALL").append(" ").append(identifier).append(";");
        return builder.toString();
    }
}
