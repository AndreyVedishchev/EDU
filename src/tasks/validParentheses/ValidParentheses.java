package tasks.validParentheses;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("[](){"));
    }
    public boolean isValid(String s) {
        char []arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
                if (arr.length%2 == 0 && arr[i] == '(' && arr[i + 1] == ')') return true;
                if (arr.length%2 == 0 && arr[i] == '[' && arr[i + 1] == ']') return true;
                if (arr.length%2 == 0 && arr[i] == '{' && arr[i + 1] == '}') return true;
        }
        return false;
    }
}
