package threads;

/**
 * Created by Андрей on 12.07.2017.
 */
public class ThreadConcurency implements Runnable {
    Thread thread;
    Statistics statistics;
    public ThreadConcurency(String name, Statistics statistics) {
        this.statistics = statistics;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {
        //{code}
        double s;
        for (int i = 0; i < 1000; i++) s = Math.sqrt(i);
        statistics.incCnt();



    }
}
