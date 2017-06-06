package abstrations;

/**
 * Created by User on 20.05.2017.
 */
public abstract class Creature {
    private int age;
    private Climbs clmbs;
    private Eniv en;//перечелсление среды обитание //сложный
    //protected Eniv en; // легкий

    public Creature(int age, Eniv en) {
        this.age = age;
        this.en = en;
    }

    public int getAge() {
        return age;
    }



    public Eniv getEn() {
        return en;
    }

    public abstract void move();
}
