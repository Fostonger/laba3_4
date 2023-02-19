package interfaces;

import enums.Verb;

public interface Interactable {
    public String getInteractionWithDescription(Verb interaction, String adjective);
}
