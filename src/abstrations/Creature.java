package abstrations;

public abstract class Creature {
    private int age;
    private Limbs limbs;
    private Eniv en;//перечелсление среды обитание //сложный
    //protected Eniv en; // легкий

    public Creature(int age, Eniv en, Limbs limbs) {
        this.age = age;
        this.en = en;
        this.limbs = limbs;
    }

    public int getAge() {
        return age;
    }

    public Limbs getLimbs() {
        return limbs;
    }

    public Eniv getEn() {
        return en;
    }

    public abstract void move();

    public abstract void sound();
}
