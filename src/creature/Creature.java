package creature;

import enums.Adjective;
import enums.Verb;
import exceptions.EmptyNameException;
import exceptions.NullObjectException;
import interfaces.Interactable;
import interfaces.ValueHoldable;

public abstract class Creature {
    private String name;

    public Creature(String name) throws EmptyNameException {
        this.name = name;
        CreatureNameValidator.check(name, this);
    }

    public String getName() { return name; }
    public String interactWith(Interactable object, Verb interaction, Adjective adjective) {
        checkNotNull(object);
        return name + " " +
                object.getInteractionWithDescription(interaction, (adjective != null) ? adjective.getValue() : "");
    }
    public String doAction(ValueHoldable action) throws NullObjectException {
        checkNotNull(action);
        return name + " " + action.getValue();
    }

    public String doActionWithDescription(ValueHoldable action, String description) throws NullObjectException {
        checkNotNull(action);
        return doAction(action) + " " + description;
    }

    private void checkNotNull(Object obj) throws NullObjectException {
        if (obj == null) throw new NullObjectException();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Creature creature = (Creature) obj;
        return getName() == creature.getName();
    }
    @Override
    public int hashCode() {
        return getName().hashCode();
    }
    @Override
    public String toString() { return getName(); }

    public static class CreatureNameValidator {
        public static void check(String name, Object obj) throws EmptyNameException {
            if (name == null || name.isBlank()) {
                throw new EmptyNameException(obj.getClass().toString());
            }
        }
    }

    // Add exception to check that objects are not null
}
