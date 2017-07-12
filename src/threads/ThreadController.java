package threads;

public class ThreadController {
    public static void main(String args[]) throws InterruptedException {
        Statistics statistics = new Statistics();
        Object monitor = new Object();

        Input t_input = new Input("input", monitor);
        Thread.sleep(10);
        synchronized (monitor) {
            System.out.println(Thread.currentThread() + " вошшел в монитор");
            new ThreadForNumbers(100,"1", false);
        }




    }
}
