package generics;

import java.applet.Applet;

/**
 * Created by Андрей on 21.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Gen2<Integer> integerGen2 = new Gen2<Integer>(5);
        Gen2<Double> doubleGen2 = new Gen2<Double>(56.4);
        int i = 1;
        double d = Math.PI;

        System.out.println(integerGen2.getSum(i));
        System.out.println(doubleGen2.getSum(d));
        System.out.println("1" + "|\t" + "Вася" + "|\t" + "01012100");
        //FileWriter filewrite = new Filewriter("C:\1.txt");
    }
}
