package bn;

import bn.ship.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Board b = new Board("Zina");
        b.print();

       b.putShip(new Battleship(Orientation.EAST.toString()),9,5);
        b.putShip(new Carrier(Orientation.NORTH.toString()),5,8);
        b.putShip(new Destroyer(Orientation.EAST.toString()),4,4);
        b.putShip(new Submarine(Orientation.SOUTH.toString()),4 ,2);
        b.putShip(new Submarine(Orientation.WEST.toString()),7 ,4);


        b.render();

    }
}
