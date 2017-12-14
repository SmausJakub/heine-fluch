package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of identifiers
 * These types can be
 * constant - identifier of type constant
 * variable - identifier of type variable
 * label - identifier of label type
 * procedure - identifier of procedure type
 */
public enum IdentifierType {
    CONSTANT("CONSTANT"),
    VARIABLE("VARIABLE"),
    LABEL("LABEL"),
    PROCEDURE("PROCEDURE");

    private String name;

    IdentifierType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
