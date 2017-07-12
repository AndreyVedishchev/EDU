package threads;

/**
 * Created by Андрей on 12.07.2017.
 */
public class Statistics {
    private int cnt = 0;
    private int cnt2 = 0;
    private int cnt3 = 0;

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

    public int getCnt2() {
        return cnt2;
    }

    public void incCnt2() {
        cnt2++;
    }

    public int getCnt3() {
        return cnt3;
    }

    public void incCnt3() {
        cnt3++;
    }
}
