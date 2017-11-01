package tasks.validParentheses;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("([|||}{"));
    }
    public boolean isValid(String s) {
        String sub, subarr;
        StringBuffer stringBuffer = new StringBuffer();
        char []arr = s.toCharArray();

//        for(int i = 0; i < arr.length; i++) {
//            if (arr.length%2 == 0) {
//                if (arr[i] == '(' && arr[i + 1] == ')' |
//                    arr[i] == '[' && arr[i + 1] == ']' |
//                    arr[i] == '{' && arr[i + 1] == '}') return true;
//
//            }
//        }

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] == '{') arr[i] = '}';
            if (arr[i] == '}') arr[i] = '{';
            if (arr[i] == '(') arr[i] = ')';
            if (arr[i] == ')') arr[i] = '(';
            if (arr[i] == '[') arr[i] = ']';
            if (arr[i] == ']') arr[i] = '[';

            stringBuffer.append(arr[i]);
            System.out.println(arr[i] + "  " + i);
        }


        subarr = stringBuffer.toString();
        sub = s.substring(arr.length/2, arr.length);

        System.out.println(subarr + " от начала к середине");
        System.out.println(sub + " от середины до конца");

        if (sub.equals(stringBuffer))return true;
        return false;
    }
}
