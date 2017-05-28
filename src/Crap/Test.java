package Crap;

import library.alt.Reader;

import java.math.BigDecimal;

/**
 * Created by User on 13.03.2017.
 */
public class Test {
    public static void main (String[] args) {
        double src = 123.45;
        int res = (int)src; //целая часть
        double res2 = src - res; //дробная часть

        System.out.println(res);
        System.out.println(res2);
    }
}
