package cz.zcu.kiv.fjp.compiler;

public class Value {

    final Object value;


    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Double asDouble() {
        return (Double) value;
    }

    public String asString() {
        return (String) value;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

}
