package cz.zcu.kiv.fjp.enums;

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
