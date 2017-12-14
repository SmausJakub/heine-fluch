package cz.zcu.kiv.fjp.compiler.types.statements;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.enums.StatementType;

/**
 * Ternary statement
 * Created by visitors and compiled by compilers
 */
public class StatementTernary extends AbstractStatement {

    /**
     * first expression
     */
    private AbstractExpression expressionOne;

    /**
     * second expression
     */
    private AbstractExpression expressionTwo;

    /**
     * condition
     */
    private AbstractExpression expression;

    /**
     * identifier
     */
    private String identifier;

    /**
     * @param identifier    identifier
     * @param expression    condition
     * @param expressionOne first expression
     * @param expressionTwo second expression
     * @param line          line number
     */
    public StatementTernary(String identifier, AbstractExpression expression, AbstractExpression expressionOne, AbstractExpression expressionTwo, int line) {
        super(StatementType.TERNARY, line);
        this.identifier = identifier;
        this.expression = expression;
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }


    public AbstractExpression getExpressionOne() {
        return expressionOne;
    }

    public AbstractExpression getExpressionTwo() {
        return expressionTwo;
    }

    public AbstractExpression getExpression() {
        return expression;
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
        builder.append(identifier).append(" := ").append(expression.toString()).append(" ? ").append(expressionOne.toString()).append(" ! ").append(expressionTwo.toString()).append(";");

        return builder.toString();
    }
}
