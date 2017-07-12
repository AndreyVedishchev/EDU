package threads;

public class ThreadController {
    public static void main(String args[]) throws InterruptedException {
        new ThreadForNumbers(10000, "1", false);
        new ThreadForNumbers(1000, "2", false);
        new ThreadForNumbers(100,"3", true);



        //todo 3 threads of one class; each outputs one digit 0-9

        /*ex 0-3
          (I thrd, II thrd, III thrd)
        * 000
        *   1
        *   2
        *   3
        *  10
        *   1
        *   2
        *   3
        *  20
        *   1
        *   2
        *
        * */
    }
}
