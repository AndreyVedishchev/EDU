package threads;

public class ThreadController {
    public static void main(String args[]) throws InterruptedException {
        class MySolution implements Runnable {
            @Override
            public void run(){
                int i = 0;
                for ( ; ; ){
                    System.out.print("(2)"+i+" ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    if (i > 9) break;
                }
            }
        }

        class VasyaSolution implements Runnable {
            @Override
            public void run() {
                for (int p = 0; p < 10; p++){
                    try {
                        Thread.sleep(950);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int i = 0;
                    for ( ; ; ) {
                        System.out.println("(3)" + i + " ");
                        i++;
                        if (i > 9) break;
                    }
                }
            }
        }

        Thread t1 = new Thread(new MySolution());
        Thread t2 = new Thread(new VasyaSolution());

        t1.start();
        t2.start();

        int i = 0;
        for ( ; ; ){
            System.out.print("(1)"+0+" ");
            Thread.sleep(990);
            i++;
            if (i > 9) break;
        }

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
        * 020
        *   1
        *   2
        *
        * */
    }
}
