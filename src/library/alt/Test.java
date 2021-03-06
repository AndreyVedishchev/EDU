package library.alt;

public class Test {
    public static void main (String args []) throws Exception {

            final int maxReaders = 100;
            final int maxBooks = 120;

        Reader[] reader = new Reader[5];
        reader[0] = new Reader("Иванов", 56);
        reader[1] = new Reader("Петров", 45);
        Reader rdr = new Reader("Сидоров", 42);

        Book[] book = new Book[maxBooks];
        book[0] = new Book("Кавказский пленник", "А.С. Пушкин",260);
        book[1] = new Book("Вий", "Н.В. Гоголь",375);
        book[2] = new Book("Таинственный остров", "Ж. Верн",490);

        Library library = new Library("Ленина", maxBooks, maxReaders);
        Library library1 = new Library("МГУ",100,10);

        library.addReader(reader[0]);
        library.addReader(reader[1]);
        library.addReader(reader[2]);
        library.addReader(rdr);
        //library.addReader(reader[2]);
        library.addBook(book[0]);
        library.addBook(book[1]);
        library.removeBook(book[1]);

        reader[0].addBook(book[0]);
        reader[0].addBook(book[1]);
        reader[0].addBook(book[2]);
        //reader[0].printReaderBooklist();

        /*reader[0].printLibrary();
        reader[1].printLibrary();
        reader[2].printLibrary();*/

        //library.removeReader(reader[0]);
        //library.removeReader(reader[1]);
        library.removeReader(rdr);
        //reader[0].printLibrary();
        reader[0].printReaderBooklist();

        System.out.println(library.getCntReader() + "    " + library.getCntBook());
    }
}

