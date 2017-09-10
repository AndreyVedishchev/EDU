package collections;

import abstrations.Gorilla;
import abstrations.Human;
import abstrations.Mammals;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Human andrey = new Human(15, "Andrey", 170, null);
        Human andrey_ = new Human(15, "Andrey", 170, null);
        Human sergey = new Human(15, "Sergey", 170, null);
        Human andrey2 = andrey;

        if (andrey.equals(sergey)) System.out.println("!");


    }
}
