// Generated from C:/Users/Kossyr/IdeaProjects/PascaL0like/src/cz/zcu/kiv/fjp\Pascal0Like.g4 by ANTLR 4.7
package cz.zcu.kiv.fjp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Pascal0LikeParser}.
 */
public interface Pascal0LikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Pascal0LikeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Pascal0LikeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 */
	void enterLegacyMode(Pascal0LikeParser.LegacyModeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 */
	void exitLegacyMode(Pascal0LikeParser.LegacyModeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 */
	void enterDefaultMode(Pascal0LikeParser.DefaultModeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 */
	void exitDefaultMode(Pascal0LikeParser.DefaultModeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strictMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 */
	void enterStrictMode(Pascal0LikeParser.StrictModeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strictMode}
	 * labeled alternative in {@link Pascal0LikeParser#declare_mode}.
	 * @param ctx the parse tree
	 */
	void exitStrictMode(Pascal0LikeParser.StrictModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Pascal0LikeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Pascal0LikeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_part(Pascal0LikeParser.Declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_part(Pascal0LikeParser.Declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#procedure_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#procedure_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration_part(Pascal0LikeParser.Procedure_declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#constant_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#constant_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration_part(Pascal0LikeParser.Constant_declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#label_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#label_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration_part(Pascal0LikeParser.Label_declaration_partContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varSimpleAs}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterVarSimpleAs(Pascal0LikeParser.VarSimpleAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varSimpleAs}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitVarSimpleAs(Pascal0LikeParser.VarSimpleAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varSimpleUnAs}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterVarSimpleUnAs(Pascal0LikeParser.VarSimpleUnAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varSimpleUnAs}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitVarSimpleUnAs(Pascal0LikeParser.VarSimpleUnAsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varParallel}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void enterVarParallel(Pascal0LikeParser.VarParallelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varParallel}
	 * labeled alternative in {@link Pascal0LikeParser#variable_declaration_part}.
	 * @param ctx the parse tree
	 */
	void exitVarParallel(Pascal0LikeParser.VarParallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#label_list}.
	 * @param ctx the parse tree
	 */
	void enterLabel_list(Pascal0LikeParser.Label_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#label_list}.
	 * @param ctx the parse tree
	 */
	void exitLabel_list(Pascal0LikeParser.Label_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(Pascal0LikeParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(Pascal0LikeParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(Pascal0LikeParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(Pascal0LikeParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#statement_part}.
	 * @param ctx the parse tree
	 */
	void enterStatement_part(Pascal0LikeParser.Statement_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#statement_part}.
	 * @param ctx the parse tree
	 */
	void exitStatement_part(Pascal0LikeParser.Statement_partContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelled}
	 * labeled alternative in {@link Pascal0LikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLabelled(Pascal0LikeParser.LabelledContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelled}
	 * labeled alternative in {@link Pascal0LikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLabelled(Pascal0LikeParser.LabelledContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonlabelled}
	 * labeled alternative in {@link Pascal0LikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNonlabelled(Pascal0LikeParser.NonlabelledContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonlabelled}
	 * labeled alternative in {@link Pascal0LikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNonlabelled(Pascal0LikeParser.NonlabelledContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void enterIo_statement(Pascal0LikeParser.Io_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#io_statement}.
	 * @param ctx the parse tree
	 */
	void exitIo_statement(Pascal0LikeParser.Io_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#ternary_statement}.
	 * @param ctx the parse tree
	 */
	void enterTernary_statement(Pascal0LikeParser.Ternary_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#ternary_statement}.
	 * @param ctx the parse tree
	 */
	void exitTernary_statement(Pascal0LikeParser.Ternary_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(Pascal0LikeParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(Pascal0LikeParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(Pascal0LikeParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(Pascal0LikeParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_statement(Pascal0LikeParser.Procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_statement(Pascal0LikeParser.Procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(Pascal0LikeParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(Pascal0LikeParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(Pascal0LikeParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(Pascal0LikeParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#while_do_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do_statement(Pascal0LikeParser.While_do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#while_do_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do_statement(Pascal0LikeParser.While_do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(Pascal0LikeParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(Pascal0LikeParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(Pascal0LikeParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(Pascal0LikeParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Pascal0LikeParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Pascal0LikeParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Pascal0LikeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Pascal0LikeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(Pascal0LikeParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(Pascal0LikeParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#case_limb_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_limb_list(Pascal0LikeParser.Case_limb_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#case_limb_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_limb_list(Pascal0LikeParser.Case_limb_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#case_limb}.
	 * @param ctx the parse tree
	 */
	void enterCase_limb(Pascal0LikeParser.Case_limbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#case_limb}.
	 * @param ctx the parse tree
	 */
	void exitCase_limb(Pascal0LikeParser.Case_limbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#case_label_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_label_list(Pascal0LikeParser.Case_label_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#case_label_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_label_list(Pascal0LikeParser.Case_label_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#default_limb}.
	 * @param ctx the parse tree
	 */
	void enterDefault_limb(Pascal0LikeParser.Default_limbContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#default_limb}.
	 * @param ctx the parse tree
	 */
	void exitDefault_limb(Pascal0LikeParser.Default_limbContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pascal0LikeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Pascal0LikeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pascal0LikeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Pascal0LikeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(Pascal0LikeParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(Pascal0LikeParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(Pascal0LikeParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(Pascal0LikeParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(Pascal0LikeParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(Pascal0LikeParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(Pascal0LikeParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(Pascal0LikeParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(Pascal0LikeParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(Pascal0LikeParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(Pascal0LikeParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(Pascal0LikeParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(Pascal0LikeParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(Pascal0LikeParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(Pascal0LikeParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(Pascal0LikeParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oddExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOddExpr(Pascal0LikeParser.OddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oddExpr}
	 * labeled alternative in {@link Pascal0LikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOddExpr(Pascal0LikeParser.OddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(Pascal0LikeParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(Pascal0LikeParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterRealAtom(Pascal0LikeParser.RealAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitRealAtom(Pascal0LikeParser.RealAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(Pascal0LikeParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(Pascal0LikeParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(Pascal0LikeParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link Pascal0LikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(Pascal0LikeParser.IdAtomContext ctx);
}