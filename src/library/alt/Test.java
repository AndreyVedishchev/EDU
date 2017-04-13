package library.alt;

public class Test {
    public static void main (String args []) throws ReaderAlreadyInLibraryException{

            final int maxReaders = 120;
            final int maxBooks = 100;

        Reader[] reader = new Reader[maxReaders];
        reader[0] = new Reader("Иванов", 56);
        reader[1] = new Reader("Петров", 45);
        reader[2] = new Reader("Сидоров", 42);

        Book[] book = new Book[maxBooks];
        book[0] = new Book(260);
        book[1] = new Book(375);
        book[2] = new Book(490);

        Library library = new Library("Ленина", 75, 45);

        library.addReader(reader[0]);
        library.addReader(reader[1]);
        library.addReader(reader[2]);

        reader[0].printLibrary();
        reader[1].printLibrary();
        reader[2].printLibrary();

        library.removeReader(reader[2]);

        reader[2].printLibrary();
    }
}

