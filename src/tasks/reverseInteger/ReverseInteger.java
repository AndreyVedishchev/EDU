/*
Цель задания получить реверс числа Integer.
*/
package tasks.reverseInteger;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.rev(1002));
    }

    public int rev(int x) {
        int result = 0;
        try {
            StringBuffer stringBuffer = new StringBuffer(Integer.toString(x));
            stringBuffer.reverse();
            result = Integer.parseInt(String.valueOf(stringBuffer));
        } catch (Exception exc) {
            System.out.println("Возвращаемое значение выходит за пределы Integer");
        }
        return result;
    }
}
