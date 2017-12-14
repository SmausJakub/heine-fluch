package cz.zcu.kiv.fjp.enums;

/**
 * Enum values representing types of for cycle
 * These types can be:
 * to - for cycle from to
 * downto - for cycle down from to
 */
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
