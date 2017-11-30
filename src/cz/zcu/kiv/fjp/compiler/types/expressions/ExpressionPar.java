package cz.zcu.kiv.fjp.compiler.types.expressions;

import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.enums.ExpressionType;

public class ExpressionPar extends AbstractExpression {

    private AbstractExpression expression;

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
