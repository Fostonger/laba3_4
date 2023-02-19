package enums;

import interfaces.ValueHoldable;

public enum Verb implements ValueHoldable {
    RUN("ran"),
    HEAD("headed to"),
    THROW_ON("threw on"),
    THINK("thought, that"),
    NOTICE("noticed"),
    BE_ABSENT("was absent"),
    COLLIDED("collided in"),
    NO_NEED("there's no need"),
    MEET("to meet"),
    UNBELIEVABLE("couldn't believe");

    public String getValue() { return actionDescription; }
    public String getValueWithDescription(String description) { return getValue() + " " + description; }
    private Verb(String actionDescription) { this.actionDescription = actionDescription; }

    private String actionDescription;
}
