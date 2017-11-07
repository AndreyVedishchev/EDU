package tasks.validParentheses;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("[]()"));
    }

    public boolean isValid(String s) {
        String sub, subarr;
        StringBuilder stringBuffer = new StringBuilder();
        char[] arr = s.toCharArray();
        int cnt1 = 0, cnt2 = 0;

        Map <Character, Integer>map = new HashMap<>();
        map.put('{', -1);
        map.put('}', 1);
        map.put('(', -2);
        map.put(')', 2);
        map.put('[', -3);
        map.put(']', 3);

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                cnt1 += map.get(arr[i]);
                if (i % 2 == 0) {
                    cnt2 = map.get(arr[i]) + map.get(arr[i + 1]);
                    System.out.println("cnt2 = "+cnt2);
                }
            }else return false;
        }

        for (int i = (arr.length - 1) / 2; i >= 0 ; i--) {
            switch (arr[i]) {
                case '{': arr[i] = '}'; break;
                case '}': arr[i] = '{'; break;
                case '(': arr[i] = ')'; break;
                case ')': arr[i] = '('; break;
                case '[': arr[i] = ']'; break;
                case ']': arr[i] = '['; break;
            }
            stringBuffer.append(arr[i]);
        }

        subarr = stringBuffer.toString();
        sub = s.substring(arr.length/2, arr.length);

        return (cnt2 == 0 || sub.equals(subarr));
    }
}