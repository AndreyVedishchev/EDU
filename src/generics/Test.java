package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        String[] arr_string = {"a", "b", "c", "z"};
        int[] arr_int = {1,2,3,4,5,10};
        Integer[] arr_integer = {1,2,3,4,5,10};
        POJO_int ob_int = new POJO_int(8);
        POJO_String ob_string = new POJO_String(8);
        Gen<String> gen_string;
        gen_string = new Gen<String>(arr_string);

        Gen<Integer> gen_int = new Gen<Integer>(arr_integer);
        ob_int.put(14);
        ob_int.print();
        ob_string.put("Hi");

    }
}
