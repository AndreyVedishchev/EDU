package collections;

import abstrations.Gorilla;
import abstrations.Human;
import abstrations.Mammals;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new LinkList<>();
        list.add("a");
        list.add("Q");
        list.add("t");
        list.add("r");
        System.out.println(list.remove("t"));

        Object[] arr = list.toArray();

        System.out.println(arr.length);
        for (Object o : arr) {
            System.out.println(o.toString());
        }
    }
}