package abstrations;

import tasks.DateTime.DateTime;

/**
 * Created by User on 20.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        Spider sp = new Spider();
        //sp.en = Eniv.GROUND;
        //sp.en = Eniv.WATER;

        DateTime dt;
        dt = sp;
        Creature cr = sp;
        //cr.en = Eniv.WATER;
        System.out.println(cr.en + " look at me");
        System.out.println(sp.en);
    }
}
