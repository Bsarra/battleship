package bn;

import javax.print.DocFlavor;
import java.io.IOException;

public class Board {

    private Character[] ships;
    private Boolean[] hits;
    private float size;
    private String name;




    public Character[] getShips() {
        return this.ships;
    }
    public void setShips(Character[] ships) {
        this.ships = ships;
    }
    public Boolean[] getHits() {
        return this.hits;
    }
    public void setHits(Boolean[] hits) {
        this.hits = hits;
    }

    public float getSize() {
        return this.size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }




    public Board(float size, String nom){
        this.size = size;
        this.name=nom;
    }
    public Board(String nom){
        this.name=nom;
        size =10;
    }

    public void  print(){
        try {Runtime.getRuntime().exec("clear");} catch (IOException e) {}
    }


    @Override
    public String toString() {
        return "Name : "+name+" size : "  +size;
    }
}

