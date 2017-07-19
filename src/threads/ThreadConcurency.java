package threads;

import java.io.File;


public class ThreadConcurency implements Runnable {
    Thread thread;
    Statistics statistics;
    private boolean pauseFlag = false;
    public ThreadConcurency(String name, Statistics statistics) {
        this.statistics = statistics;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {
        try {
            double s;
            for (int i = 0; i < 1000; i++) {
                statistics.incCnt();

                Thread.sleep(100);

                while (pauseFlag) {
                    synchronized (this){
                        this.wait();
                    }
                }
            }
        } catch (InterruptedException e){

        }
        //{code}


    }

    public void pause(){
        pauseFlag = true;
    }

    public void resume(){
        synchronized (this){
            this.pauseFlag = false;
            this.notify();
        }
    }

}
