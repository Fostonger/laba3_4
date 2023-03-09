package creature;

import enums.Verb;
import exceptions.EmptyNameException;

public class Malysh extends CreatureWithAction {
    public Malysh() throws EmptyNameException { super("Malysh"); }

    public String think(String thoughts) {
        return getName()+ " " + Verb.THINK.getValueWithDescription(thoughts);
    }
}
