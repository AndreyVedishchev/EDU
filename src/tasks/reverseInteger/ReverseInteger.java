/*
Цель задания получить реверс числа Integer.
*/
package tasks.reverseInteger;
import java.io.*;
public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(rev(-1230));

    }
    //321

    public static int rev(int x) {
        int result = 0;
//        try {
//            StringBuffer stringBuffer = new StringBuffer(Integer.toString(x));
//            stringBuffer.reverse();
//            result = Integer.parseInt(String.valueOf(stringBuffer));
//        } catch (Exception exc) {
//            System.out.println("Возвращаемое значение выходит за пределы Integer");
//        }
//        return result;
        int a = 0;
        int b = '0';
        System.out.println(a);//0
        System.out.println(b);//48
        String res = Integer.toString(x);
        char []arr = res.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            a += (arr[i] - 48) * Math.pow(10, i);

        }
        return a;
    }

}
