package tasks.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Саша", 18));
        persons.add(new Person("Глаша", 19));
        persons.add(new Person("Маша", 20));
        persons.add(new Person("Даша", 21));

        persons.stream().filter(p -> p.getAge() >= 20).forEach(System.out::println);
    }
}
