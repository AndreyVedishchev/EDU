/*
Цель задания получить реверс числа Integer.
*/
package tasks.reverseInteger;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(rev(4237));
    }

    public static int rev(int x) {
        int a = 0;
        String res = Integer.toString(x);
        char []arr = res.toCharArray();
        if (x != 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println("arr[" + i + "] = " + arr[i]);
                a += (arr[i] - 48) * Math.pow(10, i);
                //int u = arr[i];
                System.out.println(arr[0]);
            }
        }return -a;
//        if (x < 0) {
//            for (int i = arr.length - 1; i >= 0; i--) {
//                System.out.println("arr[" + i + "] = " + arr[i]);
//                a += (arr[i] - 48) * Math.pow(10, i);
//                int u = arr[i];
//                System.out.println(u);
//            }
//        }
    }
}
