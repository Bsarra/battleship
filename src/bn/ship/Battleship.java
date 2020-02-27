package bn.ship;

public class Battleship extends AbstractShip {

    public Battleship() {
        this(null);
    }

    public Battleship(String orientation) {
        super("Battleship", 'B', 4, orientation);
    }



}
