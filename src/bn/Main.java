package bn;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Board b = new Board("Zina");
        Board b1 = new Board("Sarra");

        Character[] charArray = { 'a', 'b', 'c', 'd', 'e','f','g','h','i','j' };
        b.setShips(charArray);
       // char ch = charArray[i];
        System.out.println(b+"                          " +b1);

        System.out.println(" "+Arrays.toString(charArray)+"                          " +Arrays.toString(charArray));
        for(int i=0; i<charArray.length;i++){

            System.out.println(i+"  ............................"+"                          " +i+" ............................");

        }
        //System.out.print(Arrays.toString(charArray));
        //System.out.print(b1);

    }

}
