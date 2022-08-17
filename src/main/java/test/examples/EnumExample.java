package test.examples;

import java.util.Arrays;

public enum EnumExample {
    ENUM_FIRST("first"),
    ENUM_SECOND("second"),
    ENUM_THIRD("third"),
    ENUM_FOURTH("fourth");

    private final String value;

    EnumExample(String operation) {
        this.value = operation;
    }

    public String getValue() {
        return value;
    }

    public static EnumExample getOperation(String value) {
        return Arrays.stream(values())
                .filter(o -> o.getValue().equals(value))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Value not recognized"));
    }
}
