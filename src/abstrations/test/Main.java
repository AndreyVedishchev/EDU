package abstrations.test;

import abstrations.*;

import java.util.Arrays;

/*
* TODO
* новые аттрибуты для человека+
* новые классы насекомые(абстр), пчелы, муравьи+
* byte climbs перенести в Creature и заменинть отдельным классом+
* добавить метод sound() в Creature - извдавть звук и переопределить, где нужно+*/

public class Main {
    public static void main(String[] args) {
        Limbs lb = new Limbs(2, 2,1, Coating.SKIN, 90, 70, 60);
        //System.out.println(lb.limb);
        Gorilla gorilla = new Gorilla(15, new Limbs(2,2, 30,Coating.FUR, 150, 110));
    }
}
