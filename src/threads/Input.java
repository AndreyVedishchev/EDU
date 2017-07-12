package threads;

import java.io.IOException;

/**
 * Created by Андрей on 12.07.2017.
 */
public class Input implements  Runnable {
    Thread thread;
    Object monitor;
    public Input(String name, Object monitor) {
        this.monitor = monitor;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {
        synchronized (monitor){
            System.out.println(Thread.currentThread() + " вошшел в монитор");
            System.out.println("Введите что-нибудь, чтобы начать");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Поток " + thread + " завершился");
        }

    }
}
