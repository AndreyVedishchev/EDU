package threads;

/**
 * Created by User on 20.05.2017.
 */
public class VasyaSolution implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Vasya'a solution");
    }
}
