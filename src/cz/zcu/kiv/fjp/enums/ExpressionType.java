package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing expression types
 * These types can be:
 * unary - unary minus expression
 * not - negation expression
 * mult - multiplicative expression
 * add - addition expression
 * rel - relational expression
 * log - logical expression
 * par - expression in parentheses
 * atom - atomic expression
 */
public enum ExpressionType {

    UNARY,
    NOT,
    MULT,
    ADD,
    REL,
    LOG,
    PAR,
    ATOM

}
