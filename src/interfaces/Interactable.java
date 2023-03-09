package interfaces;

import enums.Verb;

public interface Interactable {
    String getInteractionWithDescription(Verb interaction, String adjective);
}