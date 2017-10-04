package collections;

import abstrations.Gorilla;
import abstrations.Human;
import abstrations.Mammals;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collection<Number> numberCollection = new ArrayList<>();
        collection.add("a");
        collection.add("x");
        collection.add("k");
        collection.add("j");
        collection.add("'");


        Iterator<String> iterator =  collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
}