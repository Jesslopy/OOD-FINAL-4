public class GameDifficultyFacade {
    private GameState gameState;

    public GameDifficultyFacade(GameState gameState) {
        this.gameState = gameState;
    }

    public void setEasyMode() {
        gameState.setResourceMultiplier(1.5); // Easy mode gives more resources
        gameState.setInvasionChance(0.1); // Less chance of invasion
        gameState.setFamineChance(0.1); // Less chance of famine
        gameState.setPlagueChance(0.1); // Less chance of plague
    }

    public void setNormalMode() {
        gameState.setResourceMultiplier(1.0); // Normal resources
        gameState.setInvasionChance(0.3); // Normal chance of invasion
        gameState.setFamineChance(0.3); // Normal chance of famine
        gameState.setPlagueChance(0.2); // Normal chance of plague
    }

    public void setHardMode() {
        gameState.setResourceMultiplier(0.75); // Hard mode has fewer resources
        gameState.setInvasionChance(0.5); // Greater chance of invasion
        gameState.setFamineChance(0.4); // Greater chance of famine
        gameState.setPlagueChance(0.3); // Greater chance of plague
    }
}
