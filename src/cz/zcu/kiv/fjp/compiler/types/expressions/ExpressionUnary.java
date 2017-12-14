package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

/**
 * Unary minus expression
 * template:
 *  (minus) expression
 * minus is not contained within class
 * e.g.:
 *  -5
 */
public class ExpressionUnary extends AbstractExpression {

    /**
     * expression
     */
    private AbstractExpression expression;

    /**
     * @param expression expression
     */
    public ExpressionUnary(AbstractExpression expression) {
        super(ExpressionType.UNARY);
        this.expression = expression;
    }

    public AbstractExpression getExpression() {
        return expression;
    }


    @Override
    public String toString() {
        return "- " + expression.toString();
    }

}
