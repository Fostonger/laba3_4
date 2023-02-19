package creature;

import exceptions.EmptyNameException;

import java.util.StringJoiner;

public class PeopleGroup extends Creature {
    public PeopleGroup(Creature[] people) throws EmptyNameException {
        super(concatNames(people));
    }

    private static String concatNames(Creature[] people) {
        if (people == null || people.length == 0) return "";
        if (people.length == 1) return people[0].getName();
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < people.length - 1; i++) {
            joiner.add(people[i].getName());
        }
        return joiner.toString() + " and " + people[people.length - 1].getName();
    }
}
