package tasks.validParentheses;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(){}[]"));
    }

    public boolean isValid(String s) {

        char[] arr = s.toCharArray();
        List <Character>list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>" + list);

            //System.out.println("list.get(i)==" + list.get(i) + "; list.get(i + 1)==" + list.get(i + 1));

            if (list.get(i) == '(' && list.get(i + 1) == ')') {list.remove(i + 1);list.remove(i);
                System.out.println("остаток== " + list + " итерация 1()");}

            if (list.get(i) == '[' && list.get(i + 1) == ']') {list.remove(i + 1);list.remove(i);
                System.out.println("остаток== " + list + " итерация 2[]");}

            if (list.get(i) == '{' && list.get(i + 1) == '}') {list.remove(i + 1);list.remove(i);
                System.out.println("остаток== " + list + " итерация 3{}");}
            System.out.println(i);
            System.out.println("----------------------------");
        }

        System.out.println(list);
        return (list.size() == 0);
    }
}