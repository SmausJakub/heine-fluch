package cz.zcu.kiv.fjp.enums;

public enum ErrorType {

    VARIABLE_NOT_INITIALIZED(1, "VARIABLE NOT INITIALIZED"),
    VARIABLE_ALREADY_DECLARED(2, "VARIABLE ALREADY DECLARED"),
    INCOMPATIBLE_TYPES(3, "INCOMPATIBLE TYPES"),
    CONSTANT_REASSIGN(4, "CONSTANT REASSIGN"),
    UNKNOWN_IDENTIFIER(5, "UNKNOWN IDENTIFIER"),
    UNKNOWN_LABEL(6, "UNKNOWN LABEL"),
    UNKNOWN_PROCEDURE(7, "UNKNOWN PROCEDURE"),
    PARALLEL_DECLARATION_NUMBER_MISMATCH(8, "PARALLEL DECLARATION NUMBER MISMATCH"),
    CANNOT_ASSIGN_LOOP_VARIABLE(9, "CAN NOT ASSIGN LOOP VARIABLE"),
    LABEL_USED_ELSEWHERE(10, "LABEL USED ELSEWHERE"),
    LABEL_OUT_OF_REACH(11, "LABEL OUT OF REACH"),
    LABEL_NEVER_USED(12, "LABEL NEVER USED"),
    LABEL_NOT_ALLOWED_IN_FOR_CYCLE(13, "LABEL NOT ALLOWED IN FOR CYCLE");

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
