package tasks.validParentheses;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(("));
    }
    public boolean isValid(String s) {
        String sub, subarr;
        StringBuffer stringBuffer = new StringBuffer();
        char []arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if (arr.length%2 == 0) {
                if (arr[i] == '(' && arr[i + 1] == ')') return true;
                if (arr[i] == '[' && arr[i + 1] == ']') return true;
                if (arr[i] == '{' && arr[i + 1] == '}') return true;
            }
        }

        for (int i = arr.length-1; i >= arr.length/2; i--) {
            if (arr[i] == '(') arr[i] = ')';
            if (arr[i] == ')') arr[i] = '(';
            if (arr[i] == '[') arr[i] = ']';
            if (arr[i] == ']') arr[i] = '[';
            if (arr[i] == '{') arr[i] = '}';
            if (arr[i] == '}') arr[i] = '{';
            stringBuffer.append(arr[i]);
        }

        subarr = stringBuffer.toString();
        sub = s.substring(0, arr.length/2);
        if (sub.equals(subarr))return true;
        return false;
    }
}
