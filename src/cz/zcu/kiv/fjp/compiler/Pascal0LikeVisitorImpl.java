package cz.zcu.kiv.fjp.compiler;

import cz.zcu.kiv.fjp.Pascal0LikeBaseVisitor;
import cz.zcu.kiv.fjp.Pascal0LikeParser;

import java.util.*;

public class Pascal0LikeVisitorImpl extends Pascal0LikeBaseVisitor<Integer> {

    //private HashMap<String, String> variables = new HashMap<String, String>();


    @Override
    public Integer visitProgram(Pascal0LikeParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Integer visitBlock(Pascal0LikeParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitIdentifier(Pascal0LikeParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDeclaration_part(Pascal0LikeParser.Declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitProcedure_body(Pascal0LikeParser.Procedure_bodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitProcedure_heading(Pascal0LikeParser.Procedure_headingContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitConstant_declaration(Pascal0LikeParser.Constant_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitConstant(Pascal0LikeParser.ConstantContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVariable_declaration_part(Pascal0LikeParser.Variable_declaration_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVariable_simple_declaration(Pascal0LikeParser.Variable_simple_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitVariable_paralel_declaration(Pascal0LikeParser.Variable_paralel_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitIdentifier_list(Pascal0LikeParser.Identifier_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitExpression_list(Pascal0LikeParser.Expression_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitLabel(Pascal0LikeParser.LabelContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitStatement_part(Pascal0LikeParser.Statement_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitStatement_sequence(Pascal0LikeParser.Statement_sequenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitStatement(Pascal0LikeParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSimple_statement(Pascal0LikeParser.Simple_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitIo_statement(Pascal0LikeParser.Io_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitTernary_statement(Pascal0LikeParser.Ternary_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitAssignment_statement(Pascal0LikeParser.Assignment_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitGoto_statement(Pascal0LikeParser.Goto_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitProcedure_statement(Pascal0LikeParser.Procedure_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitStructured_statement(Pascal0LikeParser.Structured_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCompound_statement(Pascal0LikeParser.Compound_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitRepetitive_statement(Pascal0LikeParser.Repetitive_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitConditional_statement(Pascal0LikeParser.Conditional_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitWhile_do_statement(Pascal0LikeParser.While_do_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDo_while_statement(Pascal0LikeParser.Do_while_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitRepeat_statement(Pascal0LikeParser.Repeat_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitFor_statement(Pascal0LikeParser.For_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitIf_statement(Pascal0LikeParser.If_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCase_statement(Pascal0LikeParser.Case_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCase_limb(Pascal0LikeParser.Case_limbContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitCase_label_list(Pascal0LikeParser.Case_label_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitType(Pascal0LikeParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitExpression(Pascal0LikeParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSimple_expression(Pascal0LikeParser.Simple_expressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitTerm(Pascal0LikeParser.TermContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitFactor(Pascal0LikeParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitRelational_operator(Pascal0LikeParser.Relational_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitAddition_operator(Pascal0LikeParser.Addition_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitMultiplication_operator(Pascal0LikeParser.Multiplication_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitNegation_operator(Pascal0LikeParser.Negation_operatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitString(Pascal0LikeParser.StringContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitNumber(Pascal0LikeParser.NumberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitInteger_number(Pascal0LikeParser.Integer_numberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitReal_number(Pascal0LikeParser.Real_numberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDigit_sequence(Pascal0LikeParser.Digit_sequenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitUnsigned_digit_sequence(Pascal0LikeParser.Unsigned_digit_sequenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDigit(Pascal0LikeParser.DigitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitSign(Pascal0LikeParser.SignContext ctx) {
        return visitChildren(ctx);
    }


}
