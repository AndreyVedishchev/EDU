package tasks.threads;

public class StartThread implements Runnable{
    static int y = 0;
    Thread thread;
    String name;
    boolean stopFlag;

    public StartThread(String name) {
        this.stopFlag = true;
        this.name = name;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            //syncronised
            y++;
            System.out.println(y + " " + getName());

            while (stopFlag){
                synchronized (this){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            stopFlag = true;
        }

    }

    public void resume(){
        stopFlag =false;
        synchronized (this) {
            this.notify();
        }

    }

}
