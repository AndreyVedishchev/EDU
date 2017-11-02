package tasks.validParentheses;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(()("));
    }

    public boolean isValid(String s) throws ArrayIndexOutOfBoundsException{
        String sub, subarr;
        StringBuffer stringBuffer = new StringBuffer();
        char[] arr = s.toCharArray();
        int nestingSimple = 0;
        int nestingCurly = 0;
        int nestingSquare = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr.length % 2 == 0)
                    if (arr[i] == '(' && arr[i + 1] == ')' ||
                        arr[i] == '[' && arr[i + 1] == ']' ||
                        arr[i] == '{' && arr[i + 1] == '}') return true;

                switch (arr[i]) {
                    case '{': nestingCurly--; break;
                    case '}': nestingCurly++; break;
                    case '(': nestingSimple -= 2; break;
                    case ')': nestingSimple += 2; break;
                    case '[': nestingSquare -= 3; break;
                    case ']': nestingSquare += 3; break;
                }
            }
        }catch (Exception ignored) {}

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

        System.out.println(subarr);
        System.out.println(sub);

        return ((nestingCurly == 0 && nestingSimple == 0 && nestingSquare == 0) && sub.equals(subarr));
    }
}