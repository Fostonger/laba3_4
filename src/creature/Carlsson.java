package creature;

import enums.Adverb;
import enums.Verb;
import exceptions.EmptyNameException;

public class Carlsson extends Creature {
    public Carlsson() throws EmptyNameException { super("Carlsson"); }
    public String avoidMeetingWith(String people) {
        return Verb.NO_NEED.getValue() + " " + Adverb.FOR.combineWith(getName() + " " + Verb.MEET.getValue() + " " + people);
    }
}
