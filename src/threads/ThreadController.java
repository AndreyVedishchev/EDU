package threads;



public class ThreadController {
    public static void main(String args[]) throws InterruptedException {
        Statistics statistics = new Statistics();
        ThreadConcurency t1 = new ThreadConcurency("a", statistics);
        ThreadSimpleNotRun t2 = new ThreadSimpleNotRun("t2");
        ThreadSimpleNotRun t3 = new ThreadSimpleNotRun("t3");


        if (t2.getClass() == t3.getClass()) {
            System.out.println("!");
        }
        System.out.println(t1.thread.toString() + t1.thread.getState());
        System.out.println(t2.thread.toString() + t2.thread.getState());
        t2.thread.start();
        t3.thread.start();
        Thread.sleep(100);
        System.out.println(t2.thread.toString() + t2.thread.getState());
        System.out.println(t3.thread.toString() + t3.thread.getState());
        Thread.sleep(1000);
        System.out.println(t2.thread.toString() + t2.thread.getState());
        System.out.println(t3.thread.toString() + t3.thread.getState());
        Thread.sleep(1000);
        System.out.println(t2.thread.toString() + t2.thread.getState());
        System.out.println(t3.thread.toString() + t3.thread.getState());
    }
}
