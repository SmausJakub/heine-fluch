package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

public class StatementGoto extends AbstractStatement {

    private int value;

    public StatementGoto(int value, int line) {
        super(StatementType.GOTO, line);
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isLabelled()) {
            builder.append(getLabel().getValue()).append(": ");
        }
        builder.append("GOTO ").append(value).append(";");

        return builder.toString();
    }
}
