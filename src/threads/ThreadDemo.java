package threads;

/**
 * Created by User on 16.05.2017.
 */
public class ThreadDemo {
    public static void main(String args[]){

        //public Thread(Runnable target) {
        Thread td1;
        Thread td2;
        ThreadEx obj1 = new ThreadEx("John", 500);
        ThreadEx obj2 = new ThreadEx("Pyotr",100);

        td1 = new Thread(obj1);
        td2 = new Thread(obj2);

        obj1.td = td1;
        obj2.td = td2;

        td1.start();
        td2.start();


        obj1.run();
        obj2.run();




        //ThreadEx obtd = new ThreadEx();
        //if(obtd instanceof Runnable) System.out.println("YES");
    }




}
