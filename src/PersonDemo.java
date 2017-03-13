public class PersonDemo {
    public  static void main(String[] args){
        Person p1 = new Person(-20,6546,"Катя");
        Person p2 = new Person(18,1800,"Вася");
        Comparator obcmp = new Comparator();
        obcmp.Compare(p1,p2);
        Compare(p1,p2);


    }

    public static void Compare(Person p1, Person p2){
        if (p1.getAge() < p2.getAge()) {System.out.println(p1.name + " младше " + p2.name);}
        else {System.out.println(p1.name + " старше " + p2.name);}

        if (p1.getRost() < p2.getRost()) {System.out.println(p2.name + " выше " + p1.name);}
        else {System.out.println(p2.name + " ниже " + p1.name);}

    }
}
