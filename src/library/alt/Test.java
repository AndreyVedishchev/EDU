package library.alt;

public class Test {
    public static void main (String args []) throws ReaderAlreadyInLibraryException{
        Reader reader;
        reader = new Reader("Иванов И.И.", 2, 45);

        Library library = new Library(100, "Ленина");
        Library lib2 = new Library(1000, "Сталина");

        library.addReader(reader);
        System.out.println(library.toString());
        //lib2.addReader(reader);


        reader.printLibrary();
    }
    public static void printIsNull(Object obj){
        if (obj == null) System.out.println("объект пустой!");
        else            System.out.println("объект не пустой!");

    }
}

