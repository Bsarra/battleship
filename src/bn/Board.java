package bn;

import javax.annotation.processing.SupportedSourceVersion;
import javax.print.DocFlavor;
import java.io.IOException;

public class Board {

    private Character[][] ships;
    private Boolean[] hits;
    private float size;
    private String name;

    public Board(String name, int size){
        this.size = size;
        this.name=name;
        int i, j;

        this.ships = new Character[size][size];
        //int size = 10;
        System.out.print("   ");
        for( i = 0; i < size; i++) {
            int c = 'A' + i;
            System.out.printf("%3c", c);
        }
        System.out.println();



        for ( i = 0;i < ships.length; i++) {

            System.out.printf("%2s ",i+1);
            for ( j = 0;j < ships[i].length;j++) {
                //ships[i][j]='.';
                System.out.printf("%3s",'.');
            }
            System.out.println();
        }
        System.out.println();



    }
    public Board(String name){
      this( name, 10);
    }

    public void  print(){
        try {Runtime.getRuntime().exec("clear");} catch (IOException e) {}
    }

    @Override
    public String toString() {
        return "Name : "+name+" size : "  +size + "  " ;
    }


    public float getSize() {
        return this.size;
    }
    public String getName() {
        return this.name;
    }
}

