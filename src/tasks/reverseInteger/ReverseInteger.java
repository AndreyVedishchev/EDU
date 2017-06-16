/*
Цель задания получить реверс числа Integer.
*/
package tasks.reverseInteger;
import java.io.*;
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.rev(1230));

    }

    public int rev(int x) {
        int result = 0;
//        try {
//            StringBuffer stringBuffer = new StringBuffer(Integer.toString(x));
//            stringBuffer.reverse();
//            result = Integer.parseInt(String.valueOf(stringBuffer));
//        } catch (Exception exc) {
//            System.out.println("Возвращаемое значение выходит за пределы Integer");
//        }
//        return result;
        StringBuffer stringBuffer = new StringBuffer(Integer.toString(x));
        String res = String.valueOf(stringBuffer.reverse());
        System.out.println(res);
        char []arr = res.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(Integer.parseInt(String.valueOf(arr[i])));
            //System.out.println();
        }
        return Integer.parseInt(String.valueOf(arr));
    }

}
