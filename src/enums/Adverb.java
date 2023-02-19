package enums;

public enum Adverb {
    AFTER("after"),
    WITH("with"),
    NEITHER("neither"),
    NOR("nor"),
    IN("in"),
    FOR("for"),
    THAT("that");

    public String combineWith(String subject) { return actionDescription + " " + subject; }
    private Adverb(String actionDescription) { this.actionDescription = actionDescription; }
    public Adverb add(Adverb second) {
        actionDescription += " " + second.actionDescription;
        return this;
    }

    private String actionDescription;
}
