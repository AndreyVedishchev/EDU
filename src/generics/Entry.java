package generics;

/**
 * Created by Андрей on 01.09.2017.
 */

import java.util.ArrayList;
import java.util.List;

public class Entry {
    int num;

    public <T extends Number> Entry(T num){
        System.out.println("generic constructor");
        this.num = num.intValue();
    }

//    public Entry(int num) {
//        System.out.println("simple constructor");
//        this.num = num;
//    }



//    public double multiply(double p){
//        return num*p;
//    }
//
//    public double multiply(int p){
//        return num*p;
//    }

    public <V extends Number> double multiply(V p){

        return num*p.doubleValue();
    }
}

