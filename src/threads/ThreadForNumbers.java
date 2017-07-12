package threads;

/**
 * Created by Андрей on 12.07.2017.
 */
public class ThreadForNumbers implements Runnable {
    int delay;
    Thread thread;
    boolean printCR;

    public ThreadForNumbers(int delay,String name, boolean printCR) {
        this.delay = delay;
        this.printCR = printCR;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        for ( ;i < 100 ; i++ ){
            System.out.print(i +  " ");
            if (printCR) System.out.println();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println("Поток " + thread + " завершился");
    }
}
