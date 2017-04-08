package exceptions;

/**
 * Created by User on 08.04.2017.
 */
public class GenExc {
    void genException() throws CustomException{
        int a =  0;
        if (a < 10){
            throw new CustomException();
        }
        System.out.println("Ok!");
    }

}
