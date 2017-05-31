package Crap;

import library.alt.Reader;

/**
 * Created by User on 13.03.2017.
 */
public class Test {
    public static void main (String[] args) {
        Crap crap = new Crap("SMTH");
        //Crap2 crap2 = new Crap2();
        //crap = crap2;

        //if(crap instanceof Crap2){
            System.out.println("YES");
        //} else System.out.println("NO");


        String s1 = "Test";
        String s2 = "Test";

        s2 = "!";

        if(s1=="Test"){
            System.out.println("YES");
        } else System.out.println("NO");


        Reader rd = new Reader("TRT",11);
        Reader rd_copy = new Reader("TRT",11);

        if(rd_copy==rd){
            System.out.println("YES");
        } else System.out.println("NO");


        System.out.println( 0b100011111);
    }
}
