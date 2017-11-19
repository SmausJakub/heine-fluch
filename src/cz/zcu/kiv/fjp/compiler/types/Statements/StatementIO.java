package cz.zcu.kiv.fjp.compiler.types.Statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.IOType;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementIO extends AbstractStatement {


    private String identifier;

    private IOType type;


    public StatementIO() {
        super(StatementType.IO);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public IOType getType() {
        return type;
    }

    public void setType(IOType type) {
        this.type = type;
    }
}
