package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

/**
 * Parentheses expression
 */
public class ExpressionPar extends AbstractExpression {

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * @param expression expression
     */
    public ExpressionPar(AbstractExpression expression) {
        super(ExpressionType.PAR);
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "( " + expression.toString() + " )";
    }

}
