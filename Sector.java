//Leaf of the composite pattern used in Component


public class Sector implements Component {
    private String name;

    public Sector(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        // Leaf nodes do not add other Components.
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        // Leaf nodes do not remove Components.
        throw new UnsupportedOperationException();
    }

    @Override
    public String display() {
        return "Sector: " + name;
    }
}