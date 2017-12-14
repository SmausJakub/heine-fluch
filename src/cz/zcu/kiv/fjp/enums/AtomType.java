package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing atom values
 * These types can be:
 * integer - number
 * real - real number
 * boolean - logical true or false
 * id - identifier of some other value
 * string - a string of chars
 */
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
