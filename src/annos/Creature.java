package annos;

import abstrations.Eniv;
import abstrations.IMove;
import abstrations.ISound;
import abstrations.Limbs;

public abstract class Creature implements ISound, IMove {
    private int age;

    private Limbs limbs;
    private Eniv en;//перечелсление среды обитание //сложный
    //protected Eniv en; // легкий

    public Creature(int age, Eniv en, Limbs limbs) {
        this.age = age;
        this.en = en;
        this.limbs = limbs;
    }

    //@MyAnno(12)
    public int getAge() {

        return age;
    }

    public Limbs getLimbs() {
        return limbs;
    }

    public Eniv getEn() {
        return en;
    }

    @Override
    public abstract void move();

    @Override
    public abstract void sound();

}
