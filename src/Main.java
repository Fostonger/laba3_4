import abstractObjects.*;
import creature.*;
import enums.Adjective;
import enums.Adverb;
import enums.Verb;
import exceptions.EmptyNameException;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        try {
            // Creatures
            UncleJulius uncle = new UncleJulius();
            Malysh boy = new Malysh();
            Bok missBok = new Bok();
            Carlsson carlsson = new Carlsson();
            Fille fille = new Fille();
            Rulle rulle = new Rulle();
            class PeopleGroup extends Creature {
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
            PeopleGroup robbers = new PeopleGroup(new Creature[]{fille, rulle});
            PeopleGroup group = new PeopleGroup(new Creature[]{uncle, boy, missBok});

            // Objects

            Room room = new Room(boy);
            Robe robe = new Robe();
            Door door = new Door();
            Window window = new Window();
            Carlsson.Home home = new Carlsson.Home();
            Police police = new Police();

            IOUtils.println(uncle.interactWith(room, Verb.HEAD, Adjective.HURRY));
            IOUtils.println(boy.doActionWithDescription(Verb.RUN, Adverb.AFTER.combineWith(uncle.getName())));
            IOUtils.println(missBok.interactWith(robe, Verb.THROW_ON, null));
            IOUtils.println(missBok.interactWith(room, Verb.HEAD, Adjective.HURRY));
            IOUtils.println(group.interactWith(door, Verb.COLLIDED, null));
            IOUtils.println(boy.doActionWithDescription(Verb.NOTICE,
                    carlsson.doActionWithDescription(Verb.BE_ABSENT, Adverb.IN.combineWith(room.getName()))));
            IOUtils.println(Adjective.OPEN.getValueWithDescription(
                    window.getNameWithDescription(Adverb.IN.combineWith(room.getName()))));
            IOUtils.print(boy.think(carlsson.interactWith(home, Verb.HEAD, null) +
                    ", and " + Adjective.GOOD.getValue()));
            IOUtils.println(carlsson.avoidMeetingWith(
                    Adverb.NEITHER.add(Adverb.WITH).combineWith(robbers.getName()) + ", " +
                            Adverb.NOR.add(Adverb.WITH).combineWith(police.getName())
            ));
            IOUtils.println(boy.think(Adjective.SO_GOOD.getPrefixDescriptionForSubject(
                    Adverb.THAT.combineWith(boy.doAction(Verb.UNBELIEVABLE)))));
        }
        catch (EmptyNameException e) {
            IOUtils.println(e.getMessage());
        }
    }
}