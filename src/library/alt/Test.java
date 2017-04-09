package library.alt;

public class Test {
    public static void main (String args []) throws ReaderAlreadyInLibraryException{

        Reader[] readerList = new Reader[120];
        readerList[0] = new Reader("Иванов", 56);
        readerList[1] = new Reader("Петров", 45);
        readerList[2] = new Reader("Сидоров", 42);

        Book[] bookList = new Book[100];
        bookList[0] = new Book(260);
        bookList[1] = new Book(375);
        bookList[2] = new Book(490);

        Library library = new Library("Ленина", 100, 120);

        library.addReader(readerList[0]);
        library.addReader(readerList[1]);

        readerList[1].printLibrary();
    }
    public static void printIsNull(Object obj){
        if (obj == null) System.out.println("объект пустой!");
        else            System.out.println("объект не пустой!");

    }
}

