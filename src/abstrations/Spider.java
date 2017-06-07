package abstrations;

public class Spider extends Arthropods{
    private Webs web;

    public Spider(int age, Webs web, Limbs limbs) {
        super(age, Eniv.GROUND, limbs);
        this.web = web;
        //limbs = new Limbs(8);

    }

    public void spiderDance(){
        System.out.println("Dancing!!");
    }

    @Override
    public void move() {
        System.out.println("Spider moves with all his legs");
    }

}
