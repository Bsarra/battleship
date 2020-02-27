package bn;


import bn.ship.AbstractShip;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;


public class Board  implements IBoard {

    private final Character[][] ships;
    private final Boolean[][] hits;
    private final int size;
    private final String name;

    public Board(String name, int size) {
        this.size = size;
        this.name = name;
        this.hits = null; // TODO;
        this.ships = new Character[size][size];
    }

    public Board(String name) {
        this(name, 10);
    }

    public void  print() {
        try {
            Runtime.getRuntime().exec("clear");
            for (int i = 0; i< this.ships.length ;i++) {
                for (int j = 0; j<this.ships[i].length ;j++) {
                    this.ships[i][j] = '.';
                }
            }
          /*  for (int i = 0; i< this.hits.length ; i++) {
                for (int j = 0; j<this.hits[i].length ;j++) {

                }
            }*/
        }catch(IOException e) {
        }
    }

   @Override
    public String toString() {
   /* StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.print("   ");
        for (int c = 0; c < size; c++) {
            int currentLetter = 'A' + c;
            pw.printf("%3c", currentLetter);
        }
        pw.println();
        for (int l = 0; l < this.ships.length; l++) {
            pw.printf("%2s ", l+1 );
            for (int c = 0;c < this.ships[l].length;c++) {
               // pw.printf("%3s",'.');
                //ships[l][c]=change();
                ships[l][c]= '.';
                pw.printf("%3s",ships[l][c]);
            }
            pw.println();
        }
        pw.println();
        return sw.toString()+ "name "+ name ;*/
        return "name"+ name;
    }

    public void render() {
        System.out.println("name  Bord " + name);
        System.out.print("   ");
        for (int c = 0; c < size; c++) {
            int currentLetter = 'A' + c;
            System.out.printf("%3c", currentLetter);
        }
        System.out.println();
        for (int i = 0; i< this.ships.length; i++) {
            System.out.printf("%2s ", i+1 );
            for (int j = 0 ; j<this.ships[i].length; j++) {
                System.out.printf("%3s",this.ships[i][j]);
            }
            System.out.println();
        }
       // System.out.println();
    }


    public int getSize() {
        return this.size;
    }


    @Override
    public void putShip(AbstractShip ship, int x, int y) {

        if (ship.getOrientation() == "NORTH" ) {
            if ((x+1) -ship.getSize() >= 0) {


                for (int i = 0; i < ship.getSize(); i++) {
                    if (hasShip((x - i), y)) {
                        System.out.println("il y a deja un navirre  dans cette case " + "  X :" + (x - i) + " Y :" + y);

                    } else {
                        this.ships[x - i][y] = ship.getLabel();
                    }
                }
            } else {
                System.out.println("depassement d'un navire  "+ ship.getName() +" ori :"+ship.getOrientation()+" Y: "+y+" x: "+x);

            }
        } else if (ship.getOrientation() == "SOUTH") {
            if ((x-1)+ ship.getSize() < 10) {

                for (int i = 0; i < ship.getSize(); i++) {
                    if (hasShip((x + i), y)) {
                        System.out.println("il y a deja un navirre  dans cette case " + " X :" + (x + i) + " Y :" + y);

                    } else {
                        this.ships[x + i][y] = ship.getLabel();
                    }
                }
            } else {
                System.out.println("depassement d'un navire  "+ ship.getName() +" ori :"+ship.getOrientation()+" Y: "+y+" x: "+x);

            }
        } else if (ship.getOrientation() == "EAST" ) {
            if ((y-1)+ ship.getSize() < 10) {
                for (int i = 0; i < ship.getSize(); i++) {
                    if (hasShip(x, y + i)) {
                        System.out.println("il y a deja un navirre  dans cette case " + " X :" + x + " Y :" + (y + i));
                    } else {
                        this.ships[x][y + i] = ship.getLabel();
                    }
                }
            } else {
                System.out.println("depassement d'un navire  "+ ship.getName() +" ori :"+ship.getOrientation()+" Y: "+y+" x: "+x);
            }
        } else if (ship.getOrientation()=="WEST" ) {
            if ((y+1) -ship.getSize() >= 0) {
                for (int i = 0; i < ship.getSize(); i++) {
                    if (hasShip(x, (y - i))) {
                        System.out.println("il y a deja un navirre  dans cette case " + " X :" + x + " Y :" + (y - i));
                    } else {
                        this.ships[x][y - i] = ship.getLabel();
                    }
                }
            } else {
                System.out.println("depassement au niveau du  "+ship.getName()+" orie  :"+ship.getOrientation()+" Y : "+ y +" X: "+ x);
            }
            }


    }

    @Override
    public boolean hasShip(int x, int y) {
        if (this.ships[x][y] == '.') {

            return false;
        } else {
            return true;
        }

    }

    @Override
    public void setHit(boolean hit, int x, int y) {
        hits[x][y] = hit;
    }

    @Override
    public Boolean getHit(int x, int y) {
        return hits[x][y];
    }

    public String getName() {
        return this.name;
    }
}

