package library.alt;

/**
 * Created by User on 08.04.2017.
 */
public class ReaderAlreadyInLibraryException extends Exception {
    @Override
    public String toString(){
        return "Читатель уже находится в библитеке!";
    }


}
