package abstrations;

public class Test {
    public static void main(String[] args) {
        Spider sp = new Spider();
        Human hm = new Human();
        compareEniv(sp, Eniv.WATER);
        compareEniv(hm, Eniv.GROUND);
    }

    public static void compareEniv(Creature cr, Eniv en){
        if (cr.en == en) System.out.println("Eniv is same!");
        else System.out.println("Eniv is different");
    }
}
