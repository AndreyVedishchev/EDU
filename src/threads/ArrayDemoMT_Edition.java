package threads;



/**
 * Created by User on 21.04.2017.
 */
import static java.lang.System.out;

public class ArrayDemoMT_Edition implements Runnable {

    ArrayDemoMT_Edition(){
        new Thread(this).start();
    }
    public void run() {
        String[] str = {"John","Peter","Dana",null,"Ivan","Andrew","William","","Vladimir","","Tatyana"};
        /*
        str //array
        str[0];//string
        str[1];//string
        str[2];//string
        str[3];//string
        ....
        str[10];//string
        */

        out.println(lengthArray(str));

        for (String x : str) {
            out.println(x);
        }

        String x;
        for (int j = 0; j < str.length; j++) {
            x = str[j];
            out.println(x);
        }

    }

    //TODO метод возращает число непустых строк в составе массива
    public static int lengthArray(String[] string) {
        int l = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] != null && string[i].length() != 0 ) l++;
        }
        return l;
    }
}
