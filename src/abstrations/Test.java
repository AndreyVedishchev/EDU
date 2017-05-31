package abstrations;

import tasks.DateTime.DateTime;

/**
 * Created by User on 20.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        Spider sp = new Spider();
        Human hm = new Human();
        compareEniv(sp, Eniv.WATER);
    }
    @Deprecated
    public static void compareEniv_(Spider sp, Eniv en){ //todo !!!!!!
        if (sp.en == en) System.out.println("Eniv is same!");
        else System.out.println("Eniv is different");
    }
    @Deprecated
    public static void compareEniv_(Human hm, Eniv en){
        if (hm.en == en) System.out.println("Eniv is same!");
        else System.out.println("Eniv is different");
    }

    public static void compareEniv(Creature cr, Eniv en){
        if (cr.en == en) System.out.println("Eniv is same!");
        else System.out.println("Eniv is different");
    }

}
