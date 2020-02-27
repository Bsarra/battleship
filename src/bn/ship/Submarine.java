package bn.ship;

public class Submarine extends AbstractShip {

    public Submarine() {
        this(null);
    }

    public Submarine(String orientation) {
        super("Submarine",'S',3,orientation);
    }



}
