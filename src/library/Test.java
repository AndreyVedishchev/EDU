package library;

public class Test {
    public static void main (String args []) {
        Library lib = new Library(1000,257);
        Reader read1 = new Reader("Иванов И.И.", 54, 2);
        Reader read2 = new Reader("Петров С. С.", 33, 3);
        lib.calkBooks();
        read1.calkBooks();
        read2.calkBooks();
    }
}
