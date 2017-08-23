package exceptions;

import java.io.FileNotFoundException;

/**
 * Created by User on 07.04.2017.
 */
public class main {
    public static void main(String[] args) throws CustomException {

        try {
            String s = "t";
            s = null;
            //System.out.println("Всё оК с массивом!");
            int a = 3 / 0;
            System.out.println("Всё оК!");
        } catch (ArithmeticException exc) {
            System.out.println("Дел на ноль!");
        } catch (Exception exc) {
            System.out.println("Произошло исключение!");
        }



        try {
            //code example
            Crap.Test.main(null);
            //code example 2
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }


        //GenExc ob = new GenExc();

        //ob.genException();
    }
}
