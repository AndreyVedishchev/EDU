package abstrations;

public class Gorilla extends Mammals {

    public Gorilla(int age, Limbs limbs) {
        super(age, Eniv.GROUND, limbs);
    }

    @Override
    public void move() {
        System.out.println("Gorilla climbs skyscrapper with small blonde girl");
    }
}
