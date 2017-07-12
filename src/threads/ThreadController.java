package threads;

public class ThreadController {
    public static void main(String args[]) throws InterruptedException {
        Statistics statistics = new Statistics();

        ThreadConcurency t1 = new ThreadConcurency("1", statistics);
        ThreadConcurency t2 = new ThreadConcurency("2", statistics);
        ThreadConcurency t3 = new ThreadConcurency("3", statistics);
        ThreadConcurency t4 = new ThreadConcurency("4", statistics);
        ThreadConcurency t5 = new ThreadConcurency("5", statistics);
        t1.thread.join();
        t2.thread.join();
        t3.thread.join();
        t4.thread.join();
        t5.thread.join();
        //System.out.println(statistics.getCnt());
    }
}
