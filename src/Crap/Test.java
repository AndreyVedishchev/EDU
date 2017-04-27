package Crap;

/**
 * Created by User on 13.03.2017.
 */
public class Test {
    public static void main (String[] args) {

        String s1;
        String s2;

        s1 = "HEre"; //создан 1 объект 2214896
        s2 = s1;
        s1 = "Where"; //83545287
        System.out.println("s1 " + s1.hashCode());
        System.out.println("s2 " + s2.hashCode());
        Crap ob1, ob2;
        ob1 = new Crap("hey");
        ob2 = ob1;
        ob1.s = "lala";

        System.out.println("ob1 " + ob1.s);
        System.out.println("ob2 " + ob2.s);
    }
    static int getFactorial(int p){
        int ret;
       // if (p == 1) return 1;
        ret = getFactorial(p-1) * p;
        return ret;
    }
}
