package abstrations;

import sun.security.provider.ConfigFile;

public class Spider extends Arthropods{
    Webs web;
    Eniv en;


    public Spider(){
        super();
        super.en = Eniv.AIR;
        this.en = Eniv.GROUND;
    }

    public Eniv getEn() {
        return en;
    }
}
