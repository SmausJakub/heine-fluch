package cz.zcu.kiv.fjp;

import cz.zcu.kiv.fjp.compiler.ParserErrorListener;
import cz.zcu.kiv.fjp.compiler.compilers.CompilerProgram;
import cz.zcu.kiv.fjp.compiler.types.Program;
import cz.zcu.kiv.fjp.compiler.visitors.VisitorProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class TestData {

    // prefixes
    private static final String ANTLR_TEST_SUITE = "testFiles/ANTLR";
    private static final String ANTLR_PROGRAM_TEST_SUITE = ANTLR_TEST_SUITE + "/program";
    private static final String ANTLR_DECALARATIONS_TEST_SUITE = ANTLR_TEST_SUITE + "/declarations";
    private static final String ANTLR_STATEMENTS_TEST_SUITE = ANTLR_TEST_SUITE + "/statements";
    private static final String ANTLR_EXPRESSIONS_TEST_SUITE = ANTLR_TEST_SUITE + "/expressions";
    private static final String COMPILER_TEST_SUITE = "testFiles/compiler";
    private static final String COMPILER_ERRORS_TEST_SUITE = COMPILER_TEST_SUITE + "/errors";
    private static final String COMPILER_COMPLEX_TEST_SUITE = COMPILER_TEST_SUITE + "/complex";
    // file extensions
    private static final String SOURCE_FILES = ".pln";
    // ANTLR program files
    public static final String ANTLR_BAD_PROGRAM_MODE = ANTLR_PROGRAM_TEST_SUITE + "/bad_program_mode" + SOURCE_FILES;
    public static final String ANTLR_NO_PROGRAM_HEADING1 = ANTLR_PROGRAM_TEST_SUITE + "/no_program_heading1" + SOURCE_FILES;
    public static final String ANTLR_NO_PROGRAM_HEADING2 = ANTLR_PROGRAM_TEST_SUITE + "/no_program_heading2" + SOURCE_FILES;
    public static final String ANTLR_NO_PROGRAM_MODE = ANTLR_PROGRAM_TEST_SUITE + "/no_program_mode" + SOURCE_FILES;
    public static final String ANTLR_NO_PROGRAM_NAME = ANTLR_PROGRAM_TEST_SUITE + "/no_program_name" + SOURCE_FILES;
    public static final String ANTLR_NO_PROGRAM_STATEMENT = ANTLR_PROGRAM_TEST_SUITE + "/no_program_statement" + SOURCE_FILES;
    public static final String ANTLR_PROGRAM_LEGACY = ANTLR_PROGRAM_TEST_SUITE + "/program_mode_legacy" + SOURCE_FILES;
    public static final String ANTLR_PROGRAM_DEFAULT = ANTLR_PROGRAM_TEST_SUITE + "/program_mode_default" + SOURCE_FILES;
    public static final String ANTLR_PROGRAM_STRICT = ANTLR_PROGRAM_TEST_SUITE + "/program_mode_strict" + SOURCE_FILES;
    // ANTLR declarations files
    public static final String ANTLR_LABEL_BOOLEAN = ANTLR_DECALARATIONS_TEST_SUITE + "/label_boolean" + SOURCE_FILES;
    public static final String ANTLR_LABEL_INT1 = ANTLR_DECALARATIONS_TEST_SUITE + "/label_int1" + SOURCE_FILES;
    public static final String ANTLR_LABEL_INT2 = ANTLR_DECALARATIONS_TEST_SUITE + "/label_int2" + SOURCE_FILES;
    public static final String ANTLR_LABEL_REAL = ANTLR_DECALARATIONS_TEST_SUITE + "/label_real" + SOURCE_FILES;
    public static final String ANTLR_PROCEDURE1 = ANTLR_DECALARATIONS_TEST_SUITE + "/procedure1" + SOURCE_FILES;
    public static final String ANTLR_PROCEDURE2 = ANTLR_DECALARATIONS_TEST_SUITE + "/procedure2" + SOURCE_FILES;
    public static final String ANTLR_PROCEDURE3 = ANTLR_DECALARATIONS_TEST_SUITE + "/procedure3" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_BOOLEAN1 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_boolean1" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_BOOLEAN2 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_boolean2" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_BOOLEAN3 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_boolean3" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_BOOLEAN4 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_boolean4" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_INTEGER1 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_integer1" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_INTEGER2 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_integer2" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_INTEGER3 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_integer3" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_INTEGER4 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_integer4" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_PARALLEL1 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_parallel1" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_PARALLEL2 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_parallel2" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_REAL1 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_real1" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_REAL2 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_real2" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_REAL3 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_real3" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_REAL4 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_real4" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_LEGACY1 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_legacy1" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_LEGACY2 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_legacy2" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_LEGACY3 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_legacy3" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_LEGACY4 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_legacy4" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_NO_TYPE1 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_no_type1" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_NO_TYPE2 = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_no_type2" + SOURCE_FILES;
    public static final String ANTLR_IDENTIFIER_ONLY = ANTLR_DECALARATIONS_TEST_SUITE + "/identifier_only" + SOURCE_FILES;
    public static final String ANTLR_VARIABLE_BAD_TYPE = ANTLR_DECALARATIONS_TEST_SUITE + "/variable_bad_type" + SOURCE_FILES;
    public static final String ANTLR_CONSTANT1 = ANTLR_DECALARATIONS_TEST_SUITE + "/constant1" + SOURCE_FILES;
    public static final String ANTLR_CONSTANT2 = ANTLR_DECALARATIONS_TEST_SUITE + "/constant2" + SOURCE_FILES;
    public static final String ANTLR_CONSTANT3 = ANTLR_DECALARATIONS_TEST_SUITE + "/constant3" + SOURCE_FILES;
    public static final String ANTLR_CONSTANT4 = ANTLR_DECALARATIONS_TEST_SUITE + "/constant4" + SOURCE_FILES;
    // ANTLR expressions files
    public static final String ANTLR_ADD1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/add1" + SOURCE_FILES;
    public static final String ANTLR_ADD2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/add2" + SOURCE_FILES;
    public static final String ANTLR_ADD3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/add3" + SOURCE_FILES;
    public static final String ANTLR_ATOM1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/atom1" + SOURCE_FILES;
    public static final String ANTLR_ATOM2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/atom2" + SOURCE_FILES;
    public static final String ANTLR_ATOM3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/atom3" + SOURCE_FILES;
    public static final String ANTLR_ATOM4 = ANTLR_EXPRESSIONS_TEST_SUITE + "/atom4" + SOURCE_FILES;
    public static final String ANTLR_EXP_COMPLEX = ANTLR_EXPRESSIONS_TEST_SUITE + "/complex" + SOURCE_FILES;
    public static final String ANTLR_LOG1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/log1" + SOURCE_FILES;
    public static final String ANTLR_LOG2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/log2" + SOURCE_FILES;
    public static final String ANTLR_LOG3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/log3" + SOURCE_FILES;
    public static final String ANTLR_MULTI1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/multi1" + SOURCE_FILES;
    public static final String ANTLR_MULTI2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/multi2" + SOURCE_FILES;
    public static final String ANTLR_MULTI3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/multi3" + SOURCE_FILES;
    public static final String ANTLR_MULTI4 = ANTLR_EXPRESSIONS_TEST_SUITE + "/multi4" + SOURCE_FILES;
    public static final String ANTLR_NOT1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/not1" + SOURCE_FILES;
    public static final String ANTLR_NOT2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/not2" + SOURCE_FILES;
    public static final String ANTLR_NOT3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/not3" + SOURCE_FILES;
    public static final String ANTLR_ODD1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/odd1" + SOURCE_FILES;
    public static final String ANTLR_ODD2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/odd2" + SOURCE_FILES;
    public static final String ANTLR_ODD3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/odd3" + SOURCE_FILES;
    public static final String ANTLR_REL1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel1" + SOURCE_FILES;
    public static final String ANTLR_REL2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel2" + SOURCE_FILES;
    public static final String ANTLR_REL3 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel3" + SOURCE_FILES;
    public static final String ANTLR_REL4 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel4" + SOURCE_FILES;
    public static final String ANTLR_REL5 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel5" + SOURCE_FILES;
    public static final String ANTLR_REL6 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel6" + SOURCE_FILES;
    public static final String ANTLR_REL7 = ANTLR_EXPRESSIONS_TEST_SUITE + "/rel7" + SOURCE_FILES;
    public static final String ANTLR_UNARY1 = ANTLR_EXPRESSIONS_TEST_SUITE + "/unary1" + SOURCE_FILES;
    public static final String ANTLR_UNARY2 = ANTLR_EXPRESSIONS_TEST_SUITE + "/unary2" + SOURCE_FILES;
    // ANTLR statements files
    public static final String ANTLR_ASSIGNMENT1 = ANTLR_STATEMENTS_TEST_SUITE + "/assignment1" + SOURCE_FILES;
    public static final String ANTLR_ASSIGNMENT2 = ANTLR_STATEMENTS_TEST_SUITE + "/assignment2" + SOURCE_FILES;
    public static final String ANTLR_ASSIGNMENT3 = ANTLR_STATEMENTS_TEST_SUITE + "/assignment3" + SOURCE_FILES;
    public static final String ANTLR_CASE1 = ANTLR_STATEMENTS_TEST_SUITE + "/case1" + SOURCE_FILES;
    public static final String ANTLR_CASE2 = ANTLR_STATEMENTS_TEST_SUITE + "/case2" + SOURCE_FILES;
    public static final String ANTLR_CASE3 = ANTLR_STATEMENTS_TEST_SUITE + "/case3" + SOURCE_FILES;
    public static final String ANTLR_COMPOUND1 = ANTLR_STATEMENTS_TEST_SUITE + "/compound1" + SOURCE_FILES;
    public static final String ANTLR_COMPOUND2 = ANTLR_STATEMENTS_TEST_SUITE + "/compound2" + SOURCE_FILES;
    public static final String ANTLR_DOWHILE1 = ANTLR_STATEMENTS_TEST_SUITE + "/dowhile1" + SOURCE_FILES;
    public static final String ANTLR_DOWHILE2 = ANTLR_STATEMENTS_TEST_SUITE + "/dowhile2" + SOURCE_FILES;
    public static final String ANTLR_FOR1 = ANTLR_STATEMENTS_TEST_SUITE + "/for1" + SOURCE_FILES;
    public static final String ANTLR_FOR2 = ANTLR_STATEMENTS_TEST_SUITE + "/for2" + SOURCE_FILES;
    public static final String ANTLR_GOTO1 = ANTLR_STATEMENTS_TEST_SUITE + "/goto1" + SOURCE_FILES;
    public static final String ANTLR_GOTO2 = ANTLR_STATEMENTS_TEST_SUITE + "/goto2" + SOURCE_FILES;
    public static final String ANTLR_IF1 = ANTLR_STATEMENTS_TEST_SUITE + "/if1" + SOURCE_FILES;
    public static final String ANTLR_IF2 = ANTLR_STATEMENTS_TEST_SUITE + "/if2" + SOURCE_FILES;
    public static final String ANTLR_IF3 = ANTLR_STATEMENTS_TEST_SUITE + "/if3" + SOURCE_FILES;
    public static final String ANTLR_IO1 = ANTLR_STATEMENTS_TEST_SUITE + "/io1" + SOURCE_FILES;
    public static final String ANTLR_IO2 = ANTLR_STATEMENTS_TEST_SUITE + "/io2" + SOURCE_FILES;
    public static final String ANTLR_IO3 = ANTLR_STATEMENTS_TEST_SUITE + "/io3" + SOURCE_FILES;
    public static final String ANTLR_CALL1 = ANTLR_STATEMENTS_TEST_SUITE + "/procedure1" + SOURCE_FILES;
    public static final String ANTLR_CALL2 = ANTLR_STATEMENTS_TEST_SUITE + "/procedure2" + SOURCE_FILES;
    public static final String ANTLR_REPEATUNTIL1 = ANTLR_STATEMENTS_TEST_SUITE + "/repeatuntil1" + SOURCE_FILES;
    public static final String ANTLR_REPEATUNTIL2 = ANTLR_STATEMENTS_TEST_SUITE + "/repeatuntil2" + SOURCE_FILES;
    public static final String ANTLR_WHILEDO1 = ANTLR_STATEMENTS_TEST_SUITE + "/whiledo1" + SOURCE_FILES;
    public static final String ANTLR_WHILEDO2 = ANTLR_STATEMENTS_TEST_SUITE + "/whiledo2" + SOURCE_FILES;
    // Compiler errors files
    public static final String COMPILER_ERROR_VARIABLE_NOT_INITIALIZED = COMPILER_ERRORS_TEST_SUITE + "/variable_not_initialized" + SOURCE_FILES;
    public static final String COMPILER_ERROR_CONSTANT_REASSIGN = COMPILER_ERRORS_TEST_SUITE + "/constant_reassign" + SOURCE_FILES;
    public static final String COMPILER_ERROR_INCOMPATIBLE_TYPES1 = COMPILER_ERRORS_TEST_SUITE + "/incompatible_types1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_INCOMPATIBLE_TYPES2 = COMPILER_ERRORS_TEST_SUITE + "/incompatible_types2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LOOP_VARIABLE = COMPILER_ERRORS_TEST_SUITE + "/cannot_assign_loop_variable" + SOURCE_FILES;
    public static final String COMPILER_ERROR_CASE_ATOM1 = COMPILER_ERRORS_TEST_SUITE + "/case_atom_used_multiple_times1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_CASE_ATOM2 = COMPILER_ERRORS_TEST_SUITE + "/case_atom_used_multiple_times2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_EXPRESSION_MISMATCH1 = COMPILER_ERRORS_TEST_SUITE + "/expression_variable_type_mismatch1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_EXPRESSION_MISMATCH2 = COMPILER_ERRORS_TEST_SUITE + "/expression_variable_type_mismatch2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LABEL_NEVER_USED = COMPILER_ERRORS_TEST_SUITE + "/label_never_used" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LABEL_FOR_CYCLE = COMPILER_ERRORS_TEST_SUITE + "/label_not_allowed_in_for_cycle" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LABEL_OUT_OF_REACH = COMPILER_ERRORS_TEST_SUITE + "/label_out_of_reach" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LABEL_USED_ELSEWHERE = COMPILER_ERRORS_TEST_SUITE + "/label_used_elsewhere" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_VAR_TYPE1 = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_allows_var_type1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_VAR_TYPE2 = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_allows_var_type2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_VAR_TYPE3 = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_allows_var_type3" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_BOOL_CONSTANT = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_boolean_constant" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_REAL_CONSTANT = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_real_constant" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_LOG = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_logical_expression" + SOURCE_FILES;
    public static final String COMPILER_ERROR_LEGACY_NOT = COMPILER_ERRORS_TEST_SUITE + "/legacy_mode_not_expression" + SOURCE_FILES;
    public static final String COMPILER_ERROR_CASE_BOOLEAN1 = COMPILER_ERRORS_TEST_SUITE + "/no_boolean_type_in_case1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_CASE_BOOLEAN2 = COMPILER_ERRORS_TEST_SUITE + "/no_boolean_type_in_case2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_NON_LEGACY = COMPILER_ERRORS_TEST_SUITE + "/non_legacy_mode_var_type" + SOURCE_FILES;
    public static final String COMPILER_ERROR_PARALLEL1 = COMPILER_ERRORS_TEST_SUITE + "/parallel_declaration_number_mismatch1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_PARALLEL2 = COMPILER_ERRORS_TEST_SUITE + "/parallel_declaration_number_mismatch2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_STRICT1 = COMPILER_ERRORS_TEST_SUITE + "/strict_mode_expression_variable_type_mismatch1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_STRICT2 = COMPILER_ERRORS_TEST_SUITE + "/strict_mode_expression_variable_type_mismatch2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_UNKNOWN_IDENTIFIER1 = COMPILER_ERRORS_TEST_SUITE + "/unknown_identifier1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_UNKNOWN_IDENTIFIER2 = COMPILER_ERRORS_TEST_SUITE + "/unknown_identifier2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_UNKNOWN_LABEL = COMPILER_ERRORS_TEST_SUITE + "/unknown_label" + SOURCE_FILES;
    public static final String COMPILER_ERROR_UNKNOWN_PROCEDURE = COMPILER_ERRORS_TEST_SUITE + "/unknown_procedure" + SOURCE_FILES;
    public static final String COMPILER_ERROR_VARIABLE_DECLARED1 = COMPILER_ERRORS_TEST_SUITE + "/variable_already_declared1" + SOURCE_FILES;
    public static final String COMPILER_ERROR_VARIABLE_DECLARED2 = COMPILER_ERRORS_TEST_SUITE + "/variable_already_declared2" + SOURCE_FILES;
    public static final String COMPILER_ERROR_VARIABLE_DECLARED3 = COMPILER_ERRORS_TEST_SUITE + "/variable_already_declared3" + SOURCE_FILES;
    // Compiler complex files
    public static final String COMPILER_COMPLEX_ARMSTRONG = COMPILER_COMPLEX_TEST_SUITE + "/armstrong" + SOURCE_FILES;
    public static final String COMPILER_COMPLEX_FACTORIAL = COMPILER_COMPLEX_TEST_SUITE + "/factorial" + SOURCE_FILES;
    public static final String COMPILER_COMPLEX_FAHRENHEIT = COMPILER_COMPLEX_TEST_SUITE + "/fahrenheit" + SOURCE_FILES;
    public static final String COMPILER_COMPLEX_FIBONACCI = COMPILER_COMPLEX_TEST_SUITE + "/fibonacci" + SOURCE_FILES;
    public static final String COMPILER_COMPLEX_PALINDROME = COMPILER_COMPLEX_TEST_SUITE + "/palindrome" + SOURCE_FILES;
    public static final String COMPILER_COMPLEX_PRIME = COMPILER_COMPLEX_TEST_SUITE + "/prime" + SOURCE_FILES;


    private static final String INSTRUCTION_FILES = ".ipln";
    public static String file;
    public static ParseTree tree;

    public static final int[][] ArmstrongNumbers = {{0, 1}, {1, 1}, {2, -1}, {50, -1}, {100, -1}, {370, 1}, {371, 1}, {407, 1}, {250, -1}};
    public static final int[][] FactorialNumbers = {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720},
            {7, 5040}, {8, 40320}, {9, 362880}, {10, 3628800}};
    public static final double[][] FahrenheitNumbers = {{32, 89.6}, {30, 86}, {25, 77}, {12, 53.6}, {8, 46.4}, {0, 32}};
    public static final int[][] FibonacciNumbers = {{10, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34}};
    public static final int[][] PalindromeNumbers = {{0, 1}, {1, 1}, {2, 1}, {3, 1}, {11, 1}, {33, 1}, {44, 1}, {555, 1}, {202, 1}, {47, -1}, {51, -1}, {25, -1}};
    public static final int[][] PrimeNumbers = {{2, 1}, {3, 1}, {17, 1}, {193, 1}, {877, 1}, {907, 1}, {353, 1}, {571, 1}, {10, -1}, {556, -1}, {192, -1}};

    private TestData() {
    }

    public static void testANTLRfile() {
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pascal0LikeLexer lexer = new Pascal0LikeLexer(inputStream);

        ParserErrorListener parserErrorListener = new ParserErrorListener();

        lexer.removeErrorListeners();
        lexer.addErrorListener(parserErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Pascal0LikeParser parser = new Pascal0LikeParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);

        tree = parser.program();
    }

    public static void compileTree() {
        Program program = new VisitorProgram().visit(tree);
        new CompilerProgram(program).compileProgram();
    }
}
