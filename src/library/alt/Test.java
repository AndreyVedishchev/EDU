package library.alt;

public class Test {
    public static void main (String args []){
        Reader reader = new Reader("Иванов И.И.", 2, 45);
        Library library = new Library(100, 0);
        library.addReader(reader);
        library.addReader(reader);
        library.removeReader(reader);
    }
}
