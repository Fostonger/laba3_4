package creature;

import exceptions.EmptyNameException;
import exceptions.NullObjectException;
import interfaces.ValueHoldable;

public abstract class CreatureWithAction extends Creature {
    public CreatureWithAction(String name) throws EmptyNameException {
        super(name);
    }

    public String doAction(ValueHoldable action) throws NullObjectException {
        checkNotNull(action);
        return getName() + " " + action.getValue();
    }

    public String doActionWithDescription(ValueHoldable action, String description) throws NullObjectException {
        checkNotNull(action);
        return doAction(action) + " " + description;
    }
}
