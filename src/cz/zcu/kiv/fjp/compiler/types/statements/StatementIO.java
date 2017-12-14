package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.IOType;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * I/O statement
 * Created by visitors and compiled by compilers
 */
public class StatementIO extends AbstractStatement {

    /**
     * i/o type
     */
    private IOType type;

    /**
     * identifier
     */
    private String identifier;

    /**
     * @param identifier identifier
     * @param type       i/o type
     * @param line       line number
     */
    public StatementIO(String identifier, IOType type, int line) {
        super(StatementType.IO, line);
        this.identifier = identifier;
        this.type = type;
    }

    public IOType getType() {
        return type;
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
        builder.append(type.getName()).append(" ").append(identifier).append(";");

        return builder.toString();
    }
}
