package library.alt;

public class Test {
    public static void main (String args []) throws ReaderAlreadyInLibraryException{

        Reader[] reader = new Reader[120];
        reader[0] = new Reader("Иванов", 56);
        reader[1] = new Reader("Петров", 45);
        reader[2] = new Reader("Сидоров", 42);

        Book[] book = new Book[100];
        book[0] = new Book(260);
        book[1] = new Book(375);
        book[2] = new Book(490);

        Library library = new Library(100, "Ленина");

        library.addReader(reader[0]);
        library.addReader(reader[1]);

        reader[0].printLibrary();
    }
    public static void printIsNull(Object obj){
        if (obj == null) System.out.println("объект пустой!");
        else            System.out.println("объект не пустой!");

    }
}

