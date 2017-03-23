package library;

public class Reader extends Library implements Abstract{

    public Reader(String fio, int age, int attendance) {
      super();
      setFio(fio);
      setAge(age);
      setAttendance(attendance);
    }

    public void setFio(String fio) {
        if (fio != null)this.fio = fio;
        else this.fio = null;
    }

    public void setAge(int age) {
        if (age < 0)this.age = 0;
        if (age > 99)this.age = 99;
    }

    public void setAttendance(int attendance) {
        if (attendance > 0)this.attendance = attendance;
        else this.attendance = 0;
    }

    public void calkBooks() {
        System.out.println(fio+" имел "+takeBooks);
        Library.quantityBooks--;
        takeBooks++;
        System.out.println(fio+" взял в библиотеке "+takeBooks+" шт.");
        System.out.println();
    }
}

