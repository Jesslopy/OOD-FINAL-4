public class Character {
    private String name;
    private int health;
    private int strength;
    private Component currentLocation;
    private int wealth; // For events affecting wealth
    private int influence; // For diplomatic events
    private boolean infected; // For plague events
    private int morale; // For events affecting morale

    // Resource types
    private int food;
    private int gold;

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.wealth = 0; // Initial wealth
        this.influence = 0; // Initial influence
        this.infected = false; // Initial health status
        this.morale = 0; // Initial morale
        this.food = 100; // Initial food resource
        this.gold = 50; // Initial gold resource
    }

    public Component getCurrentLocation() {
        return currentLocation;
    }

    public void increaseWealth(int amount) {
        this.wealth += amount;
    }

    public void increaseInfluence(int amount) {
        this.influence += amount;
    }

    public void loseResources(String resource, int amount) {
        switch (resource.toLowerCase()) {
            case "food":
                this.food -= amount;
                if (this.food < 0) this.food = 0;
                break;
            case "gold":
                this.gold -= amount;
                if (this.gold < 0) this.gold = 0;
                break;
            default:
                System.out.println("Unknown resource type.");
        }
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public void increaseMorale(int amount) {
        this.morale += amount;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
        if (this.health < 0) this.health = 0;
    }

    public void decreaseStrength(int amount) {
        this.strength -= amount;
        if (this.strength < 0) this.strength = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWealth() {
        return wealth;
    }

    public int getInfluence() {
        return influence;
    }

    public boolean isInfected() {
        return infected;
    }

    public int getMorale() {
        return morale;
    }

    public int getFood() {
        return food;
    }

    public int getGold() {
        return gold;
    }

    public void setCurrentLocation(Component currentLocation) {
        this.currentLocation = currentLocation;
    }
}