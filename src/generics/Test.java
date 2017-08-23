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
        GenEnt<Gorilla> obG = new GenEnt<>(new Gorilla(20, null));

        GenEnt<Human> obH = new GenEnt<>(new Human(27, "Vasya", 178, null));

        GenEnt<Human> obH2 = new GenEnt<>(new Human(34, "Vasya", 178, null));


        GenEnt<Spider> obS = new GenEnt<>(new Spider(5, null, null));

        System.out.println(obH.isOlderThan(obG));


    }
}
