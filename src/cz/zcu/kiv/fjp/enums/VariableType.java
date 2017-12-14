package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of variables
 * These types can be:
 * integer - number
 * real - real number
 * string - string of chars
 * boolean - logical true or false
 */
public enum VariableType {

    INTEGER("INTEGER"),
    REAL("REAL"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN");

    private String value;

    VariableType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
