package threads;

/**
 * Created by User on 20.05.2017.
 */
public class ThreadController {
    public static void main(String args[]){
        //как-то запускается решение Васи в потоке 1
        // Запускается моё решение в потоке 2
        MySolution ms = new MySolution();
        VasyaSolution vs = new VasyaSolution();

        Thread t1 = new Thread((Runnable) ms);
        Thread t2 = new Thread((Runnable) vs);



    }
}
