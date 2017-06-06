package abstrations;

/**
 * Created by Андрей on 06.06.2017.
 */
public class Gorilla extends Mammals {

    public Gorilla(int age, Eniv en) {
        super(age, en);
    }

    @Override
    public void move() {
        System.out.println("Gorilla climbs skyscrapper with small blonde girl");
    }
}
