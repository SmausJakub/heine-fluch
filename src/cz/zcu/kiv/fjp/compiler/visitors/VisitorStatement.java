package cz.zcu.kiv.fjp.compiler.visitors;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;
import cz.zcu.kiv.fjp.abstracts.AbstractExpression;
import cz.zcu.kiv.fjp.abstracts.AbstractStatement;
import cz.zcu.kiv.fjp.compiler.types.CaseLimb;
import cz.zcu.kiv.fjp.compiler.types.Label;
import cz.zcu.kiv.fjp.compiler.types.statements.*;
import cz.zcu.kiv.fjp.enums.ForType;
import cz.zcu.kiv.fjp.enums.IOType;

import java.util.ArrayList;
import java.util.List;

/**
 * Statement Visitor
 * Visits the ANTLR tree and creates classes for statements
 */
public class VisitorStatement extends Pascal0LikeBaseVisitor<AbstractStatement> {

    /**
     * visits labelled statement
     *
     * @param ctx tree context
     * @return AbstractStatement
     */
    @Override
    public AbstractStatement visitLabelled(Pascal0LikeParser.LabelledContext ctx) {
        // prepare label
        Label label = new Label(Integer.parseInt(ctx.INT().getText()));

        // visit the statement
        AbstractStatement statement = this.visitChildren(ctx);

        // assign the label to it
        statement.setLabel(label);

        return statement;
    }

    /**
     * visits non labelled statement
     * @param ctx tree context
     * @return AbstractStatement
     */
    @Override
    public AbstractStatement visitNonlabelled(Pascal0LikeParser.NonlabelledContext ctx) {

        // visit the statement without labeling
        return this.visitChildren(ctx);

    }

    /**
     * visits if statement
     * @param ctx tree context
     * @return IfStatement with condition, statement and line number, optionally with else statement
     */
    @Override
    public AbstractStatement visitIf_statement(Pascal0LikeParser.If_statementContext ctx) {

        // get condition
        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());

        // get statement
        AbstractStatement statement = this.visit(ctx.statement(0));

        // check if else statement present
        if (ctx.statement(1) != null) {
            // add else statement
            AbstractStatement elseStatement = this.visit(ctx.statement(1));

            return new StatementIf(condition, statement, elseStatement, ctx.getStart().getLine());
        } else {
            return new StatementIf(condition, statement, ctx.getStart().getLine());
        }


    }

    /**
     * visits compound statement
     * @param ctx tree context
     * @return StatementCompound with list of statements and line number
     */
    @Override
    public AbstractStatement visitCompound_statement(Pascal0LikeParser.Compound_statementContext ctx) {
        List<AbstractStatement> statementList = new ArrayList<>();

        // go through all statements and add them to list
        for (int i = 0; i < ctx.statement_list().getChildCount(); i++) {
            AbstractStatement statement = this.visit(ctx.statement_list().getChild(i));

            // do not add null statements (begin end)
            if (statement == null) {
                continue;
            }
            statementList.add(statement);
        }

        return new StatementCompound(statementList, ctx.getStart().getLine());


    }

    /**
     * visits i/o statement
     * @param ctx tree context
     * @return StatementIO with identifier, type and line number
     */
    @Override
    public AbstractStatement visitIo_statement(Pascal0LikeParser.Io_statementContext ctx) {

        // determine type
        IOType type = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.READ: {
                type = IOType.READ;
                break;
            }
            case Pascal0LikeParser.WRITE: {
                type = IOType.WRITE;
                break;
            }
        }

        String identifier = ctx.IDENT().getText();

        return new StatementIO(identifier, type, ctx.getStart().getLine());
    }

    /**
     * visits ternary statement
     * @param ctx tree context
     * @return StatementTernary with identifier, expression, first and second expression and line number
     */
    @Override
    public AbstractStatement visitTernary_statement(Pascal0LikeParser.Ternary_statementContext ctx) {
        String identifier = ctx.IDENT().getText();
        VisitorExpression visitorExpression = new VisitorExpression();

        // visit all expressions
        AbstractExpression expression = visitorExpression.visit(ctx.expression(0));
        AbstractExpression ternaryOne = visitorExpression.visit(ctx.expression(1));
        AbstractExpression ternaryTwo = visitorExpression.visit(ctx.expression(2));

        return new StatementTernary(identifier, expression, ternaryOne, ternaryTwo, ctx.getStart().getLine());
    }

    /**
     * visits assignment statement
     * @param ctx tree context
     * @return StatementAssignment with identifier, expression and line number
     */
    @Override
    public AbstractStatement visitAssignment_statement(Pascal0LikeParser.Assignment_statementContext ctx) {
        String identifier = ctx.IDENT().getText();
        AbstractExpression expression = new VisitorExpression().visit(ctx.expression());
        return new StatementAssignment(identifier, expression, ctx.getStart().getLine());
    }

    /**
     * visits goto statement
     * @param ctx tree context
     * @return StatementGoto with value and line number
     */
    @Override
    public AbstractStatement visitGoto_statement(Pascal0LikeParser.Goto_statementContext ctx) {
        return new StatementGoto(Integer.parseInt(ctx.INT().getText()), ctx.getStart().getLine());
    }

    /**
     * visits procedure call statement
     * @param ctx tree context
     * @return StatementProcedure with identifier and line number
     */
    @Override
    public AbstractStatement visitProcedure_statement(Pascal0LikeParser.Procedure_statementContext ctx) {
        return new StatementProcedure(ctx.IDENT().getText(), ctx.getStart().getLine());

    }

    /**
     * visits while do statement
     * @param ctx tree context
     * @return StatementWhileDo with condition, statement and line number
     */
    @Override
    public AbstractStatement visitWhile_do_statement(Pascal0LikeParser.While_do_statementContext ctx) {

        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementWhileDo(condition, statement, ctx.getStart().getLine());
    }

    /**
     * visits do while statement
     * @param ctx tree context
     * @return StatementDoWhile with condition, statement and line number
     */
    @Override
    public AbstractStatement visitDo_while_statement(Pascal0LikeParser.Do_while_statementContext ctx) {
        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementDoWhile(condition, statement, ctx.getStart().getLine());
    }

    /**
     * visits repeat until statement
     * @param ctx tree context
     * @return StatementRepeat with condition, statement and line number
     */
    @Override
    public AbstractStatement visitRepeat_statement(Pascal0LikeParser.Repeat_statementContext ctx) {
        AbstractExpression condition = new VisitorExpression().visit(ctx.expression());
        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementRepeat(condition, statement, ctx.getStart().getLine());
    }

    /**
     * visits for statement
     * @param ctx tree context
     * @return ForStatement with identifier, expressions from and to, statement, for type and line number
     */
    @Override
    public AbstractStatement visitFor_statement(Pascal0LikeParser.For_statementContext ctx) {

        // determine for type
        ForType type = null;
        switch (ctx.op.getType()) {
            case Pascal0LikeParser.TO: {
                type = ForType.TO;
                break;
            }
            case Pascal0LikeParser.DOWNTO: {
                type = ForType.DOWNTO;
                break;
            }
        }

        String identifier = ctx.IDENT().getText();
        VisitorExpression visitorExpression = new VisitorExpression();

        // get expressions
        AbstractExpression from = visitorExpression.visit(ctx.expression(0));
        AbstractExpression to = visitorExpression.visit(ctx.expression(1));

        AbstractStatement statement = this.visit(ctx.statement());

        return new StatementFor(identifier, from, to, statement, type, ctx.getStart().getLine());


    }

    /**
     * visits case statement
     * @param ctx tree context
     * @return StatementCase with expression, list of case limbs and line number
     */
    @Override
    public AbstractStatement visitCase_statement(Pascal0LikeParser.Case_statementContext ctx) {

        AbstractExpression expression = new VisitorExpression().visit(ctx.expression());
        List<CaseLimb> limbList = new ArrayList<>();
        VisitorCase visitorCase = new VisitorCase();

        // get all case limbs
        for (int i = 0; i < ctx.case_limb_list().getChildCount(); i++) {
            CaseLimb caseLimb = visitorCase.visit(ctx.case_limb_list().getChild(i));
            limbList.add(caseLimb);
        }

        if (ctx.default_limb() != null) {
            AbstractStatement defaultStatement = new VisitorStatement().visit(ctx.default_limb());
            return new StatementCase(expression, limbList, defaultStatement, ctx.getStart().getLine());
        } else {
            return new StatementCase(expression, limbList, ctx.getStart().getLine());
        }
    }
}
