package threads;



/**
 * Created by User on 20.05.2017.
 */
public class ThreadController {

    public static void main(String args[]) throws InterruptedException {
        //как-то запускается решение Васи в потоке 1
        //Запускается моё решение в потоке 2
        MySolution ms = new MySolution();
        VasyaSolution vs = new VasyaSolution();
        MySolution ms2 = new MySolution();
        //Thread.sleep(3000); //snooze thread main for 3 sec!

        Thread t1 = new Thread(ms);
        Thread t2 = new Thread(ms2);


        t1.start();
        t2.start();
        //Thread.sleep(1000);
        int i = 0;
        for ( ; ;  ){
            i++;
            if(i>100) break;

        }


        System.out.println("main");

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
