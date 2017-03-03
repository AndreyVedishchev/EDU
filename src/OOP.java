//incapsalution
//private
//public
//default
//protected
public class OOP {
    int x;
    private int y;//будет всегда неотрицательна!
    char c;

    OOP(int p1, int p2, char p3){//constructor
        x = p1;
        c = p3;

        sety(p2);
    }

    public int gety(){//getter
        return y;
    }

    public  void sety(int p){
        if (p <= 0) y = 0;
        else y = p;
    }


}
