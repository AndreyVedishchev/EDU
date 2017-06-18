package abstrations;

/**
 * Created by Андрей on 18.06.2017.
 */
public class Car implements ISound, IDummy, IMove {


    @Override
    public void sound() {
        System.out.println("beep-beep");
    }

    @Override
    public void move() {

    }
}
