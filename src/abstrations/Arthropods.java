package abstrations;

/**
 * Created by User on 20.05.2017.
 */
public abstract class Arthropods extends Creature{
    private byte limbs;

    public Arthropods(int age, Eniv en, byte limbs) {
        super(age, en);
        this.limbs = limbs;
    }


}
