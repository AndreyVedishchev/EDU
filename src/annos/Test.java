package annos;

/**
 * Created by Андрей on 05.10.2017.
 */
public class Test {

    public static void main(String[] args) throws NoSuchMethodException {
        Test t = new Test();
        System.out.println(t.getClass().getMethod("get", String.class));
    }

    @MyAnno(56)
    void get(String s){

    }
}
