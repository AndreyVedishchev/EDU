package abstrations.test;

import abstrations.*;

/*
* TODO
* новые аттрибуты для человека+
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
        zoo[0] = new Spider(1, Webs.MEDIUM, new Limbs(8, 2));
        zoo[1] = new Gorilla(20, new Limbs(4, 150));
        move(zoo);
        zoo[2] = new Spider(3, Webs.SMALL, new Limbs(8));
        zoo[2].move();
        Object[] arr = new Object[12];
        arr[0] = zoo[1];
        Human h = new Human(23, "Sasha", 150, new Limbs(2, 80));
    }

    static void printEniv(Creature ob){
        System.out.println(ob.getEn());
    }

    static void move(Creature[] arr){
        for (Creature creature : arr) {
            if (creature != null) {
                creature.move();
            }}}}
