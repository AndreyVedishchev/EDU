/*
Цель задачи проверить является ли число палиндромом
*/
package tasks.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(258852));
    }

    public boolean isPalindrome(int x) {
        StringBuffer stringBuffer = new StringBuffer(Integer.toString(x));
        String s = String.valueOf(stringBuffer);
        String s1 = String.valueOf(stringBuffer.reverse());
        if (s.equals(s1)) {
            return true;
        }else return false;
    }
}
