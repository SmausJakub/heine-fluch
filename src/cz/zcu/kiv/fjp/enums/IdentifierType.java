package cz.zcu.kiv.fjp.enums;

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
