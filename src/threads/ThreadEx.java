package threads;

/**
 * Created by User on 16.05.2017.
 */
public class ThreadEx implements Runnable {
    String name;
    int delay;
    public Thread td;

    ThreadEx(){

    }

    public ThreadEx(String name, int delay){
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {//Это дополнительный "main"
        for (int i = 0; i < 10; i++) {
            System.out.println("Поток " + name + " рапортует " + i + " раз");
            try {
                td.sleep(this.delay);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}
