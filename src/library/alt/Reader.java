package library.alt;

public class Reader {
    private Library library;
    private String fio;
    private int age;

    public Reader(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void printLibrary(){
        if(this.library != null){
            System.out.println(this.fio + " является читателем библиотеки им. " + this.library.getName());
        }
        else {
            System.out.println(this.fio + " не читает книги!");
        }

    }

}
