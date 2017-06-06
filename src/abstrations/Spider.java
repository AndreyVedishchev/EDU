package abstrations;

public class Spider extends Arthropods{
    private Webs web;

    public Spider(int age, byte limbs, Webs web) {
        super(age, Eniv.GROUND, limbs);
        this.web = web;
    }

    public void spiderDance(){
        System.out.println("Dancing!!");
    }

    @Override
    public void move() {
        System.out.println("Spider moves with all his legs");
    }

}
