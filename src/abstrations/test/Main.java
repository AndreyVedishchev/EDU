package abstrations.test;

import abstrations.*;



public class Main {
    public static void main(String[] args) {


        Limbs lb = new Limbs(2, 2,1, Coating.SKIN, 90, 70, 60);
        //System.out.println(lb.limb);

        Gorilla gorilla = new Gorilla(15, new Limbs(2,2, 30,Coating.FUR, 150, 110));
        Car car = new Car();
        int [] ar = {1,2,3,4};
        //System.out.println(ar[7]);
        getSounds(gorilla);
        getSounds(car);
        getMove(gorilla);
        getMove(car);

    }

    static void getSounds(ISound iSound){
        iSound.sound();
    }


    static void getMove(IMove iMove){
        iMove.move();

    }
}
