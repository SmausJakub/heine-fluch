package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Goto statement
 * Created by visitors and compiled by compilers
 */
public class StatementGoto extends AbstractStatement {

    /**
     * where to jump
     */
    private int value;

    /**
     * @param value value of label to jump to
     * @param line  line number
     */
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
        builder.append(super.toString());
        builder.append("GOTO ").append(value).append(";");

        return builder.toString();
    }
}
