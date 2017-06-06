package abstrations.test;

import abstrations.*;

/*
* TODO
* новые аттрибуты для человека
* новые классы насекомые(абстр), пчелы, муравьи
* byte climbs перенести в Creature и заменинть отдельным классом
* добавить метод sound() в Creature - извдавть звук
* и переопределить, где нужно*/

/**
 * Created by Андрей on 06.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Creature[] zoo = new Creature[4];
        zoo[0] = new Spider(1,(byte) 8, Webs.MEDIUM);
        zoo[1] = new Gorilla(20, Eniv.GROUND);
        move(zoo);
        zoo[2] = new Spider(3,(byte) 8 , Webs.SMALL);
        zoo[2].move();
        Object[] arr = new Object[12];
        arr[0] = zoo[1];

    }

    static void printEniv(Creature ob){
        System.out.println(ob.getEn());
    }

    static void move(Creature[] arr){
        for (Creature creature : arr) {
            if (creature != null) {
                creature.move();
            }

        }
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i].move();
//            //arr[i] === creature
//        }
    }




}
