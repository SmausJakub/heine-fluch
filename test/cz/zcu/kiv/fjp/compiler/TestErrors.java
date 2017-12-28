package cz.zcu.kiv.fjp.compiler;

import cz.zcu.kiv.fjp.TestData;
import cz.zcu.kiv.fjp.compiler.compilers.CompilerData;
import cz.zcu.kiv.fjp.enums.ErrorType;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.runners.MethodSorters;

import static cz.zcu.kiv.fjp.TestData.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestErrors {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().muteForSuccessfulTests();


    @Before
    public void setUp() {
        CompilerData.currentLevel = 0;
        CompilerData.instructionList.clear();
        CompilerData.symbolTable.clearTable();
        CompilerData.gotoList.clear();
        CompilerData.currentAddress = 0;
        CompilerData.declarationCounter = 0;
    }

    @Test
    public void TestVariableNotInitialized() {
        exit.expectSystemExitWithStatus(ErrorType.VARIABLE_NOT_INITIALIZED.getCode());
        file = TestData.COMPILER_ERROR_VARIABLE_NOT_INITIALIZED;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestConstantReassign() {
        exit.expectSystemExitWithStatus(ErrorType.CONSTANT_REASSIGN.getCode());
        file = TestData.COMPILER_ERROR_CONSTANT_REASSIGN;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestIncompatibleTypes1() {
        exit.expectSystemExitWithStatus(ErrorType.INCOMPATIBLE_TYPES.getCode());
        file = TestData.COMPILER_ERROR_INCOMPATIBLE_TYPES1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestIncompatibleTypes2() {
        exit.expectSystemExitWithStatus(ErrorType.INCOMPATIBLE_TYPES.getCode());
        file = TestData.COMPILER_ERROR_INCOMPATIBLE_TYPES2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLoopVariable() {
        exit.expectSystemExitWithStatus(ErrorType.CANNOT_ASSIGN_LOOP_VARIABLE.getCode());
        file = TestData.COMPILER_ERROR_LOOP_VARIABLE;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestCaseAtom1() {
        exit.expectSystemExitWithStatus(ErrorType.CASE_MULTIPLE_ATOMS.getCode());
        file = TestData.COMPILER_ERROR_CASE_ATOM1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestCaseAtom2() {
        exit.expectSystemExitWithStatus(ErrorType.CASE_MULTIPLE_ATOMS.getCode());
        file = TestData.COMPILER_ERROR_CASE_ATOM2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestExpressionTypeMismatch1() {
        exit.expectSystemExitWithStatus(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH.getCode());
        file = TestData.COMPILER_ERROR_EXPRESSION_MISMATCH1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestExpressionTypeMismatch2() {
        exit.expectSystemExitWithStatus(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH.getCode());
        file = TestData.COMPILER_ERROR_EXPRESSION_MISMATCH2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLabelNeverUsed() {
        exit.expectSystemExitWithStatus(ErrorType.LABEL_NEVER_USED.getCode());
        file = TestData.COMPILER_ERROR_LABEL_NEVER_USED;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLabelNotForCycle() {
        exit.expectSystemExitWithStatus(ErrorType.LABEL_NOT_ALLOWED_IN_FOR_CYCLE.getCode());
        file = TestData.COMPILER_ERROR_LABEL_FOR_CYCLE;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLabelOutOfReach() {
        exit.expectSystemExitWithStatus(ErrorType.LABEL_OUT_OF_REACH.getCode());
        file = TestData.COMPILER_ERROR_LABEL_OUT_OF_REACH;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLabelUsedElsewhere() {
        exit.expectSystemExitWithStatus(ErrorType.LABEL_USED_ELSEWHERE.getCode());
        file = TestData.COMPILER_ERROR_LABEL_USED_ELSEWHERE;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyModeVarType1() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_VAR_TYPE.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_VAR_TYPE1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyModeVarType2() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_VAR_TYPE.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_VAR_TYPE2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyModeVarType3() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_VAR_TYPE.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_VAR_TYPE3;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyBooleanConstant() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_BOOLEAN_CONSTANT.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_BOOL_CONSTANT;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyRealConstant() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_REAL_CONSTANT.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_REAL_CONSTANT;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyLogExpression() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_LOGICAL_EXPRESSION.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_LOG;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestLegacyNotExpression() {
        exit.expectSystemExitWithStatus(ErrorType.LEGACY_NOT_EXPRESSION.getCode());
        file = TestData.COMPILER_ERROR_LEGACY_NOT;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestCaseNoBoolean1() {
        exit.expectSystemExitWithStatus(ErrorType.CASE_NO_BOOLEAN.getCode());
        file = TestData.COMPILER_ERROR_CASE_BOOLEAN1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestCaseNoBoolean2() {
        exit.expectSystemExitWithStatus(ErrorType.CASE_NO_BOOLEAN.getCode());
        file = TestData.COMPILER_ERROR_CASE_BOOLEAN2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestNonLegacyVarType() {
        exit.expectSystemExitWithStatus(ErrorType.NON_LEGACY_VAR_TYPE.getCode());
        file = TestData.COMPILER_ERROR_NON_LEGACY;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestParallelDeclarationMismatch1() {
        exit.expectSystemExitWithStatus(ErrorType.PARALLEL_DECLARATION_NUMBER_MISMATCH.getCode());
        file = TestData.COMPILER_ERROR_PARALLEL1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestParallelDeclarationMismatch2() {
        exit.expectSystemExitWithStatus(ErrorType.PARALLEL_DECLARATION_NUMBER_MISMATCH.getCode());
        file = TestData.COMPILER_ERROR_PARALLEL2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestExpressionTypeMismatchStrict1() {
        exit.expectSystemExitWithStatus(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH_STRICT.getCode());
        file = TestData.COMPILER_ERROR_STRICT1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestExpressionTypeMismatchStrict2() {
        exit.expectSystemExitWithStatus(ErrorType.EXPRESSION_VARIABLE_TYPE_MISMATCH_STRICT.getCode());
        file = TestData.COMPILER_ERROR_STRICT2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestUnknownIdentifier1() {
        exit.expectSystemExitWithStatus(ErrorType.UNKNOWN_IDENTIFIER.getCode());
        file = TestData.COMPILER_ERROR_UNKNOWN_IDENTIFIER1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestUnknownIdentifier2() {
        exit.expectSystemExitWithStatus(ErrorType.UNKNOWN_IDENTIFIER.getCode());
        file = TestData.COMPILER_ERROR_UNKNOWN_IDENTIFIER2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestUnknownProcedure() {
        exit.expectSystemExitWithStatus(ErrorType.UNKNOWN_PROCEDURE.getCode());
        file = TestData.COMPILER_ERROR_UNKNOWN_PROCEDURE;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestUnknownLabel() {
        exit.expectSystemExitWithStatus(ErrorType.UNKNOWN_LABEL.getCode());
        file = TestData.COMPILER_ERROR_UNKNOWN_LABEL;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestVariableAlreadyDeclared1() {
        exit.expectSystemExitWithStatus(ErrorType.VARIABLE_ALREADY_DECLARED.getCode());
        file = TestData.COMPILER_ERROR_VARIABLE_DECLARED1;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestVariableAlreadyDeclared2() {
        exit.expectSystemExitWithStatus(ErrorType.VARIABLE_ALREADY_DECLARED.getCode());
        file = TestData.COMPILER_ERROR_VARIABLE_DECLARED2;
        testANTLRfile();
        compileTree();
    }

    @Test
    public void TestVariableAlreadyDeclared3() {
        exit.expectSystemExitWithStatus(ErrorType.VARIABLE_ALREADY_DECLARED.getCode());
        file = TestData.COMPILER_ERROR_VARIABLE_DECLARED3;
        testANTLRfile();
        compileTree();
    }


}
