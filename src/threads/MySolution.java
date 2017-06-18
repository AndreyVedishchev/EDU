package threads;

/**
 * Created by User on 20.05.2017.
 */
public class MySolution implements Runnable {

    @Override
    public void run(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My solution");
    }

}
