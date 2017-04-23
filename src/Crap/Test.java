package Crap;

/**
 * Created by User on 13.03.2017.
 */
import static java.lang.System.out;
public class Test {
    public static void main(String[] args) {
        String[] str = {"John","Peter","Dana","","Ivan","Andrew","William","","Vladimir","","Tatyana"};


        out.println(getLenght(str));
    }

    public static int getLenght(Object[] arr){
        return arr.length();
    }

}
