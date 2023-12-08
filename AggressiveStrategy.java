

public class AggressiveStrategy implements Strategy {
    @Override
    public void executeStrategy(Character character, GameState gameState) {
        System.out.println(character.getName() + " is using an aggressive strategy.");

        double effectiveness = gameState.getResourceMultiplier();
        // Aggressive actions might be more effective with more resources
        int damage = (int)(10 * effectiveness); // Base damage scaled with resources

        // Apply the strategy's effect - e.g., dealing damage to an enemy
        // This is a simplified example. You can add more complex logic here.
    }
}
