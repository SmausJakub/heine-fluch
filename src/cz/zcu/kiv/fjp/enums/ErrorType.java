package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing error types
 */
public enum ErrorType {

    VARIABLE_NOT_INITIALIZED(1, "VARIABLE NOT INITIALIZED"),
    VARIABLE_ALREADY_DECLARED(2, "VARIABLE ALREADY DECLARED"),
    CONSTANT_REASSIGN(3, "CONSTANT REASSIGN"),
    UNKNOWN_IDENTIFIER(4, "UNKNOWN IDENTIFIER"),
    UNKNOWN_LABEL(5, "UNKNOWN LABEL"),
    UNKNOWN_PROCEDURE(6, "UNKNOWN PROCEDURE"),
    PARALLEL_DECLARATION_NUMBER_MISMATCH(7, "PARALLEL DECLARATION NUMBER MISMATCH"),
    INCOMPATIBLE_TYPES(8, "INCOMPATIBLE TYPES"),
    EXPRESSION_VARIABLE_TYPE_MISMATCH(9, "EXPRESSION VARIABLE TYPE MISMATCH"),
    EXPRESSION_VARIABLE_TYPE_MISMATCH_STRICT(10, "STRICT MODE EXPRESSION VARIABLE TYPE MISMATCH"),
    CANNOT_ASSIGN_LOOP_VARIABLE(11, "CAN NOT ASSIGN LOOP VARIABLE"),
    LABEL_USED_ELSEWHERE(12, "LABEL USED ELSEWHERE"),
    LABEL_OUT_OF_REACH(13, "LABEL OUT OF REACH"),
    LABEL_NEVER_USED(14, "LABEL NEVER USED"),
    LABEL_NOT_ALLOWED_IN_FOR_CYCLE(15, "LABEL NOT ALLOWED IN FOR CYCLE"),
    CASE_NO_BOOLEAN(16, "NO BOOLEAN TYPE IN CASE"),
    CASE_MULTIPLE_ATOMS(17, "CASE ATOM USED MULTIPLE TIMES"),
    LEGACY_VAR_TYPE(18, "LEGACY MODE ONLY ALLOWS VAR TYPE"),
    LEGACY_REAL_CONSTANT(19, "LEGACY MODE REAL CONSTANT NOT ALLOWED"),
    LEGACY_BOOLEAN_CONSTANT(20, "LEGACY MODE BOOLEAN CONSTANT NOT ALLOWED"),
    LEGACY_LOGICAL_EXPRESSION(21, "LEGACY MODE LOGICAL EXPRESSION NOT ALLOWED"),
    LEGACY_NOT_EXPRESSION(22, "LEGACY MODE NEGATION EXPRESSION NOT ALLOWED"),
    NON_LEGACY_VAR_TYPE(23, "NON LEGACY MODE VAR TYPE NOT ALLOWED"),
    STACK_OVERFLOW(24, "STACK OVERFLOW"),
    STACK_UNDERFLOW(25, "STACK UNDERFLOW"),
    UNKNOWN_INSTRUCTION(26, "UNKNOWN INSTRUCTION"),
    PROGRAM_COUNTER(27, "PROGRAM COUNTER IS OUT OF RANGE");

    private int code;
    private String description;

    ErrorType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
