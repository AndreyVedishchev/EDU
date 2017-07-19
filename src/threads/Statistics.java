package threads;

/**
 * Created by Андрей on 12.07.2017.
 */
public class Statistics {
    private int cnt = 0;
    Object null_;
    public int getCnt() {
        return cnt;
    }

    public synchronized void incCnt() {
        //System.out.println(this + "\t" +Thread.currentThread().toString());
        cnt++;
        //System.out.println(this.getCnt()+ "\t" + Thread.currentThread());


    }

}
