package abstractObjects;

import creature.Creature;
import enums.Verb;

public class Room extends AbstractObject {

    public Room(Creature owner) {
        super(owner.getName() + "'s room");
    }
}
