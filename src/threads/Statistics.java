package threads;

/**
 * Created by Андрей on 12.07.2017.
 */
public class Statistics {
    private int cnt = 0;

    public int getCnt() {
        return cnt;
    }

    public void incCnt() {
        synchronized (this){
            cnt++;
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(this.getCnt());
        }


    }

}
