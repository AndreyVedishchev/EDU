package people;

/**
 * Created by User on 13.03.2017.
 */
public class Birthday {
    private int dd;
    private int mm;
    private int year;

    Birthday (int a, int b, int c){
        dd = a;
        mm = b;
        year = c;

    }

    public void setDd(int dd) {
        this.dd = dd;
        if (dd < 1) this.dd = 1;
        if (dd > 31) this.dd = 31;
    }

    public int getDd() {
        return dd;
    }

    public void setMm(int mm) {
        this.mm = mm;
        if (mm < 1) this.mm = 1;
        if (mm > 12) this.mm = 12;
    }

    public int getMm() {
        return mm;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

