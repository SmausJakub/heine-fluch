package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Assignment statement
 * Created by visitors and compiled by compilers
 */
public class StatementAssignment extends AbstractStatement {

    /**
     * identifier
     */
    private String identifier;

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * @param identifier identifier
     * @param expression expression
     * @param line       line number
     */
    public StatementAssignment(String identifier, AbstractExpression expression, int line) {
        super(StatementType.ASSIGNMENT, line);
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());

        builder.append(identifier).append(" := ").append(expression.toString()).append(";");

        return builder.toString();
    }
}
