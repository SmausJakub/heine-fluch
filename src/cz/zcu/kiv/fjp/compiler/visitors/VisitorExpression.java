package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractAtom;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.compiler.types.expressions.*;
import cz.zcu.kiv.fjp.enums.OperatorAddition;
import cz.zcu.kiv.fjp.enums.OperatorLogic;
import cz.zcu.kiv.fjp.enums.OperatorMultiplication;
import cz.zcu.kiv.fjp.enums.OperatorRelation;

/**
 * Expression Visitor
 * Visits the ANTLR tree and creates classes for expressions
 */
public class VisitorExpression extends Pascal0LikeBaseVisitor<AbstractExpression> {

    /**
     * visits unary expression
     *
     * @param ctx tree context
     * @return ExpressionUnary with expression
     */
    @Override
    public AbstractExpression visitUnaryExpr(Pascal0LikeParser.UnaryExprContext ctx) {

        AbstractExpression abstractExpression = this.visit(ctx.expression());

        return new ExpressionUnary(abstractExpression);
    }

    /**
     * visits not expression
     * @param ctx tree context
     * @return ExpressionNot with expression
     */
    @Override
    public AbstractExpression visitNotExpr(Pascal0LikeParser.NotExprContext ctx) {

        AbstractExpression abstractExpression = this.visit(ctx.expression());

        return new ExpressionNot(abstractExpression);

    }

    /**
     * visits logic expression
     * @param ctx tree context
     * @return ExpressionLogic with left and right expression, operator
     */
    @Override
    public AbstractExpression visitLogicExpr(Pascal0LikeParser.LogicExprContext ctx) {

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        // determine operator
        OperatorLogic operator = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.AND: {
                operator = OperatorLogic.AND;
                break;
            }
            case Pascal0LikeParser.OR: {
                operator = OperatorLogic.OR;
                break;
            }
        }

        return new ExpressionLogic(leftExpression, rightExpression, operator);

    }

    /**
     * visits multiplication expression
     * @param ctx tree context
     * @return ExpressionMultiplication with left and right expression, operator
     */
    @Override
    public AbstractExpression visitMultiplicationExpr(Pascal0LikeParser.MultiplicationExprContext ctx) {

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        // determine operator
        OperatorMultiplication operator = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.MULTIPLY: {
                operator = OperatorMultiplication.MULTIPLY;
                break;
            }
            case Pascal0LikeParser.DIVIDE: {
                operator = OperatorMultiplication.DIVIDE;
                break;
            }
        }

        return new ExpressionMultiplication(leftExpression, rightExpression, operator);

    }

    /**
     * visits atom expression
     * @param ctx tree context
     * @return ExpressionAtom with atom
     */
    @Override
    public AbstractExpression visitAtomExpr(Pascal0LikeParser.AtomExprContext ctx) {

        VisitorAtom visitorAtom = new VisitorAtom();

        AbstractAtom atom = visitorAtom.visit(ctx.atom());

        return new ExpressionAtom(atom);

    }

    /**
     * visits additive expression
     * @param ctx tree context
     * @return ExpressionAdditive with left and right expression, operator
     */
    @Override
    public AbstractExpression visitAdditiveExpr(Pascal0LikeParser.AdditiveExprContext ctx) {

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        // determine operator
        OperatorAddition operator = null;
        switch (ctx.op.getType()) {

            case Pascal0LikeParser.PLUS: {
                operator = OperatorAddition.PLUS;
                break;
            }
            case Pascal0LikeParser.MINUS: {
                operator = OperatorAddition.MINUS;
                break;
            }

        }


        return new ExpressionAdditive(leftExpression, rightExpression, operator);
    }

    /**
     * visits relational expression
     * @param ctx tree context
     * @return ExpressionRelational with left and right expression, operator
     */
    @Override
    public AbstractExpression visitRelationalExpr(Pascal0LikeParser.RelationalExprContext ctx) {

        AbstractExpression leftExpression = this.visit(ctx.expression(0));
        AbstractExpression rightExpression = this.visit(ctx.expression(1));

        // determine operator
        OperatorRelation operator = null;
        switch (ctx.op.getType()) {

            case Pascal0LikeParser.EQUAL: {
                operator = OperatorRelation.EQUAL;
                break;
            }
            case Pascal0LikeParser.NOT_EQUAL: {
                operator = OperatorRelation.NOT_EQUAL;
                break;
            }
            case Pascal0LikeParser.LE: {
                operator = OperatorRelation.LE;
                break;
            }
            case Pascal0LikeParser.LT: {
                operator = OperatorRelation.LT;
                break;
            }
            case Pascal0LikeParser.GE: {
                operator = OperatorRelation.GE;
                break;
            }
            case Pascal0LikeParser.GT: {
                operator = OperatorRelation.GT;
                break;
            }
        }

        return new ExpressionRelational(leftExpression, rightExpression, operator);
    }

    /**
     * visits par expression
     * @param ctx tree context
     * @return ExpressionPar with expression
     */
    @Override
    public AbstractExpression visitParExpr(Pascal0LikeParser.ParExprContext ctx) {

        AbstractExpression expression = this.visit(ctx.expression());

        return new ExpressionPar(expression);
    }


}
