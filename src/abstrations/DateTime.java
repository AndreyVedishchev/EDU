package abstrations;

/**
 * Created by User on 20.05.2017.
 */
public class DateTime {
    int yyyy, mm, dd, hh, mi, ss, ml;

    public DateTime(int yyyy, int mm, int dd, int hh, int mi, int ss, int ml) {
        this.yyyy = yyyy;
        this.mm = mm;
        this.dd = dd;
        this.hh = hh;
        this.mi = mi;
        this.ss = ss;
        this.ml = ml;
    }

    //Конструктор из long 1495305987725
    //Точка отсчета 01.01.1970 00:00:00.0000

    public void printRussianF(){
        System.out.println("" + dd + '.' + mm + '.' + yyyy +' ' + hh + ':' + mi + ':' + ss);
    }
}
