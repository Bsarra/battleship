package bn.ship;

public class Carrier extends AbstractShip {

    public Carrier() {
        this(null);
    }

    public Carrier(String orientation) {
        super("Carrier", 'C', 5, orientation);
    }



}
