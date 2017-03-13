package Crap;

/**
 * Created by User on 13.03.2017.
 */
public class Test {
    public static void main (String[] args) {

        //0..... восьмиричное представленне
        //0b... двоичное
        //0x... шестнадцатиричное

        System.out.print(getFactorial(10));
    }
    static int getFactorial(int p){
        int ret;
       // if (p == 1) return 1;
        ret = getFactorial(p-1) * p;
        return ret;
    }
}
