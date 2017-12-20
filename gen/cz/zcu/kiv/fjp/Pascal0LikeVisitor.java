// Generated from C:/Users/Jakub/IdeaProjects/heine-fluch/src/cz/zcu/kiv/fjp\Pascal0Like.g4 by ANTLR 4.7
package cz.zcu.kiv.fjp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Pascal0LikeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Pascal0LikeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Pascal0LikeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyMode(Pascal0LikeParser.LegacyModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultMode(Pascal0LikeParser.DefaultModeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strictMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictMode(Pascal0LikeParser.StrictModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Pascal0LikeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_part(Pascal0LikeParser.Declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#procedure_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#constant_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#label_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSimpleAs}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSimpleAs(Pascal0LikeParser.VarSimpleAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSimpleUnAs}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSimpleUnAs(Pascal0LikeParser.VarSimpleUnAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varParallel}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParallel(Pascal0LikeParser.VarParallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#label_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_list(Pascal0LikeParser.Label_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(Pascal0LikeParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(Pascal0LikeParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#statement_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_part(Pascal0LikeParser.Statement_partContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelled}
	 * labeled alternative in {@link Pascal0LikeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelled(Pascal0LikeParser.LabelledContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonlabelled}
	 * labeled alternative in {@link Pascal0LikeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlabelled(Pascal0LikeParser.NonlabelledContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#io_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo_statement(Pascal0LikeParser.Io_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#ternary_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_statement(Pascal0LikeParser.Ternary_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(Pascal0LikeParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(Pascal0LikeParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_statement(Pascal0LikeParser.Procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(Pascal0LikeParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(Pascal0LikeParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#while_do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do_statement(Pascal0LikeParser.While_do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(Pascal0LikeParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(Pascal0LikeParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Pascal0LikeParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Pascal0LikeParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(Pascal0LikeParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#case_limb_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_limb_list(Pascal0LikeParser.Case_limb_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#case_limb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_limb(Pascal0LikeParser.Case_limbContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#case_label_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label_list(Pascal0LikeParser.Case_label_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pascal0LikeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Pascal0LikeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(Pascal0LikeParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(Pascal0LikeParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(Pascal0LikeParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(Pascal0LikeParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(Pascal0LikeParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(Pascal0LikeParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(Pascal0LikeParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(Pascal0LikeParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oddExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOddExpr(Pascal0LikeParser.OddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(Pascal0LikeParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealAtom(Pascal0LikeParser.RealAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(Pascal0LikeParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(Pascal0LikeParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(Pascal0LikeParser.StringAtomContext ctx);
}