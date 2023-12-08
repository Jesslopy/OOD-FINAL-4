public class DefensiveStrategy implements Strategy {
    @Override
    public void executeStrategy(Character character, GameState gameState) {
        System.out.println(character.getName() + " is using a defensive strategy.");

        double effectiveness = 1.0 / gameState.getResourceMultiplier();
        // Defensive actions might be more effective with fewer resources
        int defenseBoost = (int)(5 * effectiveness); // Base defense boost

        // Apply the strategy's effect - e.g., increasing character's defense
        // This is a simplified example. You can add more complex logic here.
    }
}