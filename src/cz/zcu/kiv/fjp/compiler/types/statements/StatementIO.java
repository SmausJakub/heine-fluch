package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.IOType;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementIO extends AbstractStatement {

    private IOType type;
    private String identifier;


    public StatementIO(String identifier, IOType type) {
        super(StatementType.IO);
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
        builder.append(type.getName()).append(" ").append(identifier);

        return builder.toString();
    }
}
