package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Procedure call statement
 * Created by visitors and compiled by compilers
 */
public class StatementProcedure extends AbstractStatement {

    /**
     * identifier
     */
    private String identifier;

    /**
     * @param identifier procedure identifier
     * @param line       line number
     */
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
        builder.append(super.toString());
        builder.append("CALL").append(" ").append(identifier).append(";");
        return builder.toString();
    }
}
