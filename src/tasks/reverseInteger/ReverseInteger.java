/*
Цель задания получить реверс числа Integer.
*/
package tasks.reverseInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(rev(1646324359));
    }

    public static int rev(int x) {

        final int min = -2147483648;
        final int max = 2147483647;

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

        long result = Long.parseLong(String.valueOf(stringBuffer));
        if (result < min || result > max) return 0;
        else return (int) result;
    }
}
