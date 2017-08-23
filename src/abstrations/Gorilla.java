package abstrations;

public class Gorilla extends Mammals {

    public Gorilla(int age, Limbs limbs) {
        super(age, Eniv.GROUND, limbs);
    }


    public void UUAUAU(){

    }
    @Override
    public void move() {
        System.out.println("Gorilla climbs skyscrapper with small blonde girl");
    }

    @Override
    public void sound() {
        System.out.println("У-а-а");
    }
}
