/*
Цель задания получить реверс числа Integer.
*/
package tasks.reverseInteger;
import java.io.*;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(rev(-1230));
    }

    public static int rev(int x) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        String res = Integer.toString(x);
        char []arr = res.toCharArray();

        if (x < 0) {
            stringBuffer.append("-");
            for (int i = arr.length - 1; i > 0; i--) {
                stringBuffer.append(arr[i]);
            }
        }

        else {
            for (int i = arr.length - 1; i >= 0; i--) {
                stringBuffer.append(arr[i]);
            }
        }

        return Integer.parseInt(String.valueOf(stringBuffer));
    }

}
