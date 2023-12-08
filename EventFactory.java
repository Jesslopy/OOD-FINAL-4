//Factory Method for Event Creation

public class EventFactory {

    public static Event createEvent(String eventType) {
        if (eventType.equalsIgnoreCase("Invasion")) {
            return new InvasionEvent();
        }
        // Additional event types can be added here
        throw new IllegalArgumentException("Unknown event type: " + eventType);
    }
}