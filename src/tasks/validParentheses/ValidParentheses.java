package tasks.validParentheses;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("([])"));
    }

    public boolean isValid(String s) {

        char[] arr = s.toCharArray();
        List <Character>list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == '(' && list.get(i + 1) == ')'||
                list.get(i) == '[' && list.get(i + 1) == ']'||
                list.get(i) == '{' && list.get(i + 1) == '}') {

                list.remove(i + 1);
                list.remove(i);
            } else return false;
        }
        return (list.size() == 0);
    }
}