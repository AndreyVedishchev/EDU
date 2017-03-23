package library;

public class Library implements Abstract{
    static int quantityBooks = 100;  //сколько книг числится в библиотеке
    String fio;
    int age;
    int takeBooks; //сколько книг на руках
    int attendance;//сколько раз приходит в месяц


    /*public void setQuantityBooks(int quantityBooks) {
        if (quantityBooks > 0)this.quantityBooks = quantityBooks;
        else this.quantityBooks = 0;
    }

    public void setQanttityReaders(int qanttityReaders) {
        if (qanttityReaders > 0)this.qanttityReaders = qanttityReaders;
        else this.qanttityReaders = 0;
    }

    public void setFio(String fio) {
        if (fio != null)this.fio = fio;
        else this.fio = null;
    }

    public void setAge(int age) {
        if (age < 0)this.age = 0;
        if (age > 99)this.age = 99;
    }

    public void setTakeBooks(int takeBooks) {
        if (takeBooks > 0)this.takeBooks = takeBooks;
        else this.takeBooks = 0;
    }

    public void setAttendance(int attendance) {
        if (attendance > 0)this.attendance = attendance;
        else this.attendance = 0;
    }*/

    public void calkBooks() {
        System.out.println("Числится книг в библиотеке "+quantityBooks+" шт.");
        System.out.println("осталось "+quantityBooks);
        System.out.println();
    }
}