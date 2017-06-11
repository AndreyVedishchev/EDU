package abstrations;

public class Bees extends Arthropods{

    public Bees(int age, Eniv en, Limbs limbs) {
        super(age, en, limbs);
    }

    @Override
    public void move() {

    }

    @Override
    public void sound() {
        System.out.println("ZZZZZZZZZZZZ");
    }
}
