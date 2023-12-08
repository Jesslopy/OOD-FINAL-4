public interface Event {
    void triggerEvent(Character character);
}

class InvasionEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("An invasion has occurred in " + character.getCurrentLocation().display());
        // The character may lose health, or fight back, etc.
        character.decreaseHealth(10); 
    }
}

class FamineEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A severe famine has struck " + character.getCurrentLocation().display() + ", weakening everyone.");
        character.decreaseHealth(10);
        character.decreaseStrength(5);
    }
}

class TreasureDiscoveryEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + " has discovered a hidden treasure in " + character.getCurrentLocation().display());
        character.increaseWealth(50); // Assuming a method to increase wealth exists.
    }
}

class DiplomaticEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + " enters into a diplomatic encounter in " + character.getCurrentLocation().display());
        character.increaseInfluence(5); // Assuming a method to increase influence exists.
    }
}

class NaturalDisasterEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A devastating natural disaster has occurred in " + character.getCurrentLocation().display());
        character.decreaseHealth(30);
        character.loseResources("food", 20); // Assuming a method to lose resources exists.
    }
}

class TradeOpportunityEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println(character.getName() + " has encountered a lucrative trade opportunity in " + character.getCurrentLocation().display());
        character.increaseWealth(25);
    }
}

class PlagueEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A deadly plague spreads through " + character.getCurrentLocation().display() + ", afflicting the population.");
        character.decreaseHealth(15);
        character.setInfected(true); // Assuming a method to set infected status exists.
    }
}

class BanditAttackEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("Bandits have ambushed travelers in " + character.getCurrentLocation().display() + ".");
        character.decreaseHealth(15);
        character.loseResources("gold", 10); // Use loseResources for gold loss
    }
}

class FestivalEvent implements Event {
    @Override
    public void triggerEvent(Character character) {
        System.out.println("A grand festival brings joy and celebration to " + character.getCurrentLocation().display());
        character.increaseMorale(10); // Assuming a method to increase morale exists.
    }
}

