package abstrations;

public class Human extends  Mammals {

    private String name;
    private int height;

    public Human(int age, String name, int height, Limbs limbs) {
        super(age, Eniv.GROUND, limbs);
        this.name = name;
        this.height = height;
    }

    @Override
    public void move() {

    }
}
