public class DiplomaticStrategy implements Strategy {
    @Override
    public void executeStrategy(Character character, GameState gameState) {
        System.out.println(character.getName() + " is engaging in diplomacy.");

        double invasionChance = gameState.getInvasionChance();
        // Diplomatic actions might be more effective with lower invasion chances
        int diplomaticPoints = (int)((1.0 - invasionChance) * 10);

        // Apply the strategy's effect - e.g., reducing hostility or gaining allies
        // This is a simplified example. You can add more complex logic here.
    }
}