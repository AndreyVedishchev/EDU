package abstrations;

/**
 * Created by User on 20.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        DateTime dt = new DateTime(2017,05,20,22,20,00,00);
        //System.out.println(System.currentTimeMillis());
        //dt.printRussianF();
        Spider sp = new Spider();
        //sp.en = Eniv.GROUND;
        sp.en = Eniv.WATER;
        System.out.println(sp.limbs);
        System.out.println(sp.web);
        System.out.println(sp.en);
    }
}
