package people;

/**
 * Created by User on 13.03.2017.
 */
public class Comparator {
    void Compare(Person p1, Person p2) {
        if (p1.getAge() < p2.getAge()) {
            System.out.println(p1.name + " младше " + p2.name);
        } else {
            System.out.println(p1.name + " старше " + p2.name);
        }

        if (p1.getRost() < p2.getRost()) {
            System.out.println(p2.name + " выше " + p1.name);
        } else {
            System.out.println(p2.name + " ниже " + p1.name);
        }
    }
}
