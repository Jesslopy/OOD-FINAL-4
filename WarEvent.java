import java.util.List;

public class WarEvent implements Event {

    @Override
    public void triggerEvent(Character character) {
        System.out.println("War has broken out in " + character.getCurrentLocation().display());

        List<Character> affectedCharacters = character.getCurrentLocation().getCharacters();
        for (Character affectedCharacter : affectedCharacters) {
            affectedCharacter.decreaseHealth(30);
            affectedCharacter.loseResources("food", 20);
            affectedCharacter.loseResources("gold", 15);

            // Replace with an actual event or remove this part
            // Event additionalEvent = new ActualEvent();
            // additionalEvent.triggerEvent(affectedCharacter);
        }
    }
}
