package abstrations;

/**
 * Created by User on 31.05.2017.
 */
public class Human extends  Mammals {
    public Human(){
        super();
        this.en = Eniv.GROUND;
    }


    public Eniv getEn() {
        return en;
    }
}
