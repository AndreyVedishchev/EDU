package tasks.threads;

public class StartThread implements Runnable{
    static int y = 0;
    Thread thread;
    String name;

    public StartThread(String name) {
        this.name = name;
        this.thread = new Thread(this, name);
        this.thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        y++;
        System.out.println(y + " " + getName());
    }

}
