package cz.zcu.kiv.fjp.enums;

public enum VariableType {

    INTEGER("integer"),
    REAL("real"),
    STRING("string"),
    BOOLEAN("boolean");


    private String name;

    VariableType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
