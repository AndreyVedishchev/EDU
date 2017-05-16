package Crap;

/**
 * Created by User on 16.05.2017.
 */
public class Crap2 extends Crap{
    public int mode;
    public Crap2(){
        super("Test");
        this.mode = 1;
    }
    @Override
    void PrintSMTH(){
        System.out.println("I am Crap2");
    }

    public int getMode() {
        return mode;
    }
}
