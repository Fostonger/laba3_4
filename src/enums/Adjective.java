package enums;

import interfaces.ValueHoldable;

public enum Adjective implements ValueHoldable {
    HURRY("hurriedly"),
    OPEN("was open"),
    GOOD("is good"),
    SO_GOOD("is so good");

    private String description;

    private Adjective(String description) {
        this.description = description;
    }

    public String getValue() { return description; }

    public String getValueWithDescription(String description) { return description + " " + description; }
    public String getPrefixDescriptionForSubject(String subject) { return description + " " + subject; }
}
