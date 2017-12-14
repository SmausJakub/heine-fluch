package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

import java.util.List;

/**
 * Compound statement
 * Created by visitors and compiled by compilers
 */
public class StatementCompound extends AbstractStatement {

    /**
     * list of statements
     */
    private List<AbstractStatement> statementList;

    /**
     * @param statementList list of statements
     * @param line          line number
     */
    public StatementCompound(List<AbstractStatement> statementList, int line) {
        super(StatementType.COMPOUND, line);
        this.statementList = statementList;
    }

    public List<AbstractStatement> getStatementList() {
        return statementList;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("BEGIN ");

        for (AbstractStatement statement : statementList) {
            builder.append(statement.toString()).append("\n");
        }

        builder.append(" END");

        return builder.toString();

    }
}
