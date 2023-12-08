import java.util.Scanner;
import java.util.Random;

public class TowerConquestGame {
    private GameState gameState;

    public TowerConquestGame() {
        gameState = new GameState();
        initializeGameElements();
    }

    private void initializeGameElements() {
        // Create characters
        Character hero = new Character("Hero", 100, 10);
        Character villain = new Character("Villain", 100, 15);

        // Add characters to GameState
        gameState.addCharacter(hero);
        gameState.addCharacter(villain);

        // Initialize other game elements as needed
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to Tower Conquest!");
        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting game...");
                break;
            }

            // Command processing
            if (command.equalsIgnoreCase("trigger event")) {
                gameState.triggerRandomEvent();
            } else if (command.equalsIgnoreCase("show status")) {
                gameState.displayStatus();
            }

            // Additional command processing as needed
        }
    }

    public static void main(String[] args) {
        TowerConquestGame game = new TowerConquestGame();
        game.startGame();
    }
}
