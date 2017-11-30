package cz.zcu.kiv.fjp.enums;

public enum ForType {

    TO("TO"),
    DOWNTO("DOWNTO");

    private String name;

    ForType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
