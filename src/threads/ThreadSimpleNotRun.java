package threads;

/**
 * Created by Андрей on 18.07.2017.
 */
public class ThreadSimpleNotRun implements Runnable {
    public Thread thread;

    public ThreadSimpleNotRun(String name) {
        this.thread = new Thread(this, name);
    }

    @Override
    public void run() {
        synchronized (this.getClass()){
            try {
                Thread.sleep(1000);
//                synchronized (this){
//                    this.wait();
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
