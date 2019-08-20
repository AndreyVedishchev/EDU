package tasks.testRosgosstrakh;

public class StringTest {

    /**
     * Метод для проверки строки на наличие только цифр
     * @param str - входящая строка
     * @return true - если в строке только цифры; false - если в строке есть что-то, кроме цифр.
     */
    public boolean ifOnlyDigits(String str) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод для проверки строки на наличие только символов
     * @param str - входящая строка
     * @return true - если в строке только символы; false - если в строке есть что-то, кроме символов.
     */
    public boolean ifOnlyCharacters(String str) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringTest st = new StringTest();
        System.out.println(st.ifOnlyDigits("12345"));
        System.out.println(st.ifOnlyDigits("1q2w3e4r5"));
        System.out.println(st.ifOnlyDigits("asdfg"));
        System.out.println(st.ifOnlyDigits(""));
        System.out.println("***********");
        System.out.println(st.ifOnlyCharacters("12345"));
        System.out.println(st.ifOnlyCharacters("1q2w3e4r5"));
        System.out.println(st.ifOnlyCharacters("asdfg"));
        System.out.println(st.ifOnlyCharacters(""));
    }
}