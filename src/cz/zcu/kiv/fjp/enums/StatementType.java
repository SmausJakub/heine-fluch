package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of statements
 * These types can be:
 * assignment - expression assigned to variable
 * procedure - calling a procedure
 * goto - jump to a label
 * ternary - ternary assignment
 * io - input or output statement
 * compound - begin end statement
 * while do - cycle while do
 * do while - cycle do while
 * repeat - cycle repeat until
 * if - condition check
 * case - multi-condition check
 * for - cycle for
 */
public enum StatementType {

    ASSIGNMENT,
    PROCEDURE,
    GOTO,
    TERNARY,
    IO,
    COMPOUND,
    WHILE_DO,
    DO_WHILE,
    REPEAT,
    IF,
    CASE,
    FOR

}
