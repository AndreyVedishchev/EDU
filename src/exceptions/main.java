package exceptions;

/**
 * Created by User on 07.04.2017.
 */
public class main {
    public static void main(String[] args) throws CustomException{
        /*
        try {
            String s = "t";
            s = null;
            int[] num = new int[4];
            s.hashCode();
            //System.out.println("Всё оК с массивом!");
            int a = 3/0;
            System.out.println("Всё оК!");
        }

        catch (ArithmeticException exc){
            System.out.println("Дел на ноль!");
        }
        catch (Exception exc){
            System.out.println("Произошло исключение!");
        }
        */

        GenExc ob = new GenExc();

        ob.genException();
    }
}
