package abstractObjects;

import enums.Verb;
import exceptions.NullObjectException;
import interfaces.Interactable;

public abstract class AbstractObject implements Interactable {
    private String name;

    public AbstractObject(String name) { this.name = name; }
    public String getName() { return this.name; }
    public String getNameWithDescription(String description) {
        return getName() +  " " + description;
    }
    public String getInteractionWithDescription(Verb interaction, String description) {
        checkNotNull(description);
        if (description.isEmpty() && interaction == null) {
            return "";
        }
        if (description.isEmpty()) {
            return interaction.getValue() + " " + getName();
        } else if (interaction == null) {
            return getName() + " " + description;
        } else {
            return interaction.getValue() + " " + getName() + " " + description;
        }
    }
    private void checkNotNull(Object obj) throws NullObjectException {
        if (obj == null) throw new NullObjectException();
    }
}
