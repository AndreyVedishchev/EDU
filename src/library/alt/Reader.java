package library.alt;

public class Reader {
    private Library library;
    private String fio;
    private int attendance;
    private int age;

    public Reader(String fio, int attendance, int age) {
        this.fio = fio;
        this.attendance = attendance;
        this.age = age;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
