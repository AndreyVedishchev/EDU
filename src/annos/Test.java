package annos;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

public class Test {
    String s;
    public static void main(String[] args) throws NoSuchMethodException {
        Test t = new Test();
        for (Method method : t.getClass().getDeclaredMethods()) {

            //System.out.println(method + " " + method.getAnnotation(MyAnno.class));
            if (method.getAnnotation(MyAnno.class) != null) {
                //System.out.println(" : " + method.getAnnotation(MyAnno.class).value());
            }
        }

        System.out.println(t.getClass().getDeclaredFields().length);
    }

    @MyAnno(value = 5, max = 12)
    public void get(int p) throws NoSuchMethodException {
        if (this.getClass().getMethod("get", Integer.class).getAnnotation(MyAnno.class).max() < p){
            throw new IllegalArgumentException();
        }
    }

    private char smth(){
        return 'h';
    }
}
