package library.alt;

public class Test {
    public static void main (String args []){
        Reader reader;
        reader = new Reader("Иванов И.И.", 2, 45);

        Library library = new Library(100, "Ленина");
        Library lib2 = new Library(1000, "Сталина");
        //System.out.println(library.hashCode());
        //System.out.println(lib2.hashCode());
        library.addReader(reader);

        //lib2.addReader(reader);

        //lib2.removeReader(reader);
        //library.removeReader(reader);
        reader.printLibrary();
    }
    public static void printIsNull(Object obj){
        if (obj == null) System.out.println("объект пустой!");
        else            System.out.println("объект не пустой!");

    }
}

