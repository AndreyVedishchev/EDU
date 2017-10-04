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

    @Override
    public void sound() {
        System.out.println("Болтаю не по детски");
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o instanceof Human){

            Human anHuman = (Human) o;
            if (this.getAge() == anHuman.getAge()
                    && this.name == anHuman.name
                    && this.height == anHuman.height) {
                return true;
            }
        }
        return false;

    }


}
