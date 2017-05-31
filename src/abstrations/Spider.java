package abstrations;

import sun.security.provider.ConfigFile;

public class Spider extends Arthropods{
    Webs web;


    public Spider(){
        super();
        this.en = Eniv.GROUND;
    }

    public Eniv getEn() {
        return en;
    }
}
