package library.alt;

/**
 * Created by User on 21.04.2017.
 */
public class LibraryIsFull extends Exception {
    @Override
    public String toString() { return "В библиотеке нет места";}
}
