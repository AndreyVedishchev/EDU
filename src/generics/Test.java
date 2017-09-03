package generics;


;import abstrations.Gorilla;
import abstrations.Human;
import abstrations.Spider;
import jdk.internal.org.objectweb.asm.Handle;


/**
 * Created by Андрей on 21.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Entry entry = new Entry(10);

        System.out.println(entry.multiply(100l));

    }
}
