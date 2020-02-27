package bn.ship;


public abstract class AbstractShip {
    private final String name;
    private final Character label;
    private final int size;
    private String orientation;

    public AbstractShip(String name,Character label,int size, String orientation) {
        this.name = name;
        this.label = label;
        this.size = size;
        this.orientation = orientation;
    }

    public String getName() {
        return this.name;
    }

    public Character getLabel() {
        return this.label;
    }

    public int getSize() {
        return this.size;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

}
