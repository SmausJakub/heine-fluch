package cz.zcu.kiv.fjp.enums;

public enum AtomType {

    INT("INTEGER"),
    REAL("REAL"),
    BOOLEAN("BOOLEAN"),
    ID("IDENTIFIER"),
    STRING("STRING");

    private String name;

    AtomType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
