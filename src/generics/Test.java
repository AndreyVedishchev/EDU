package generics;

import java.applet.Applet;

/**
 * Created by Андрей on 21.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        POJO_int ob = new POJO_int(10);

        Object[] ob_arr = new Object[10];
        /*
        byte Byte
        short Short
        int Integer
        long Long
        boolean Boolean
        char Character
        float Float
        double double

        */

        Long l = 190l;//new Long(190);
        System.out.println(l);
        Character c = 'g';
        Integer i = 10;
        int a = 19;
        ob.put(a);
        System.out.println(l);
        long l2 = l;
    }
}
