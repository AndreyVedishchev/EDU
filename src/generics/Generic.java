package generics;

/**
 * Created by Андрей on 23.08.2017.
 */
public class Generic<T extends Number> {
    T fld;


    public Generic(T fld) {
        this.fld = fld;
    }

    public double getVal(){
        return fld.doubleValue();
    }

    public boolean isBiggerThan(Generic<?> ob){
        if (this.getVal() > ob.getVal()) return true;
        else return false;
    }

}
