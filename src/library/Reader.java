package library;

public class Reader extends Library implements Abstract{

    public Reader(String fio, int age, int attendance) {
        super(0, 0, fio, age, 0, attendance);
    }

    public int calkBooks() {
        System.out.println(fio+" имел "+takeBooks);
        takeBooks++;
        quantityBooks--;
        System.out.println(fio+" взял в библиотеке "+takeBooks+" шт.");
        System.out.println();
        return quantityBooks;
    }
}

