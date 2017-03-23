package library;

public class Library implements Abstract{
    int quantityBooks;  //сколько книг числится в библиотеке
    int qanttityReaders;//сколько читателей в библиотеке
    String fio;
    int age;
    int takeBooks; //сколько книг на руках
    int attendance;//сколько раз приходит в месяц

    Library(int quantityBooks, int qanttityReaders, String fio, int age, int takeBooks, int attendance) {
        this.quantityBooks = quantityBooks;
        this.qanttityReaders = qanttityReaders;
        this.fio = fio;
        this.age = age;
        this.takeBooks = takeBooks;
        this.attendance = attendance;
    }

    Library(int quantityBooks, int qanttityReaders) {
        this.quantityBooks = 1000;
        this.qanttityReaders = qanttityReaders;
    }

    public void setQuantityBooks(int quantityBooks) {
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
    }

    public int calkBooks() {
        System.out.println("Числится книг в библиотеке "+quantityBooks+" шт.");
        quantityBooks--;
        System.out.println("осталось "+quantityBooks);
        System.out.println();
        return quantityBooks;
    }
}