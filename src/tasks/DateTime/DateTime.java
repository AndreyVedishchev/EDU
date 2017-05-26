package tasks.DateTime;

public class DateTime {
    int yyyy, mm, dd, hh, mi, ss, ml;

    final static int SECOND_IN_YEAR = 31557600;
    final static int SECOND_IN_MONTH = 2629800;
    final static int SECOND_IN_DAY = 86400;
    final static int SECOND_IN_HOUR = 3600;
    final static int SECOND_IN_MINUTE = 60;

    final static double INDREX_FOR_YEAR = 60/60/24/30.4375/12;
    final static double INDREX_FOR_MONTH = 60/60/24/30.4375;
    final static double INDREX_FOR_DAY = 60/60/24;
    final static double INDREX_FOR_HOUR = 60/60;
    long time;

    public DateTime(long time) {
        this.time = time;
    }

    @Deprecated
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

    public double getYyyy() {
        double i = time/60/60/24/30.4375/12;
        return i;
    }

    public void foo() {
        int getYearWhole = (int) getYyyy();

        double getMonth = (time - (getYearWhole * SECOND_IN_YEAR))/60/60/24/30.4375;
        int getMonthWhole = (int) getMonth;

        double getDay = ((getMonth * SECOND_IN_MONTH) - (getMonthWhole * SECOND_IN_MONTH))/60/60/24;
        int getDayWhole = (int) getDay;

        double getHours = ((getDay * SECOND_IN_DAY) - (getDayWhole * SECOND_IN_DAY))/60/60;
        int getHoursWhole = (int) getHours;

        double getMinutes = ((getHours * SECOND_IN_HOUR) - (getHoursWhole * SECOND_IN_HOUR))/60;
        int getMinutesWhole = (int) getMinutes;

        double getSeconds = (getMinutes * SECOND_IN_MINUTE) - (getMinutesWhole * SECOND_IN_MINUTE);
        int getSecondsWhole = (int) getSeconds;

        System.out.println(1970+getYearWhole+"  "+getMonthWhole+"  "+getDayWhole+"  "+getHoursWhole+"  "+getMinutesWhole+"  "+getSecondsWhole);
    }

    public static void main(String[] args) {
        DateTime dt = new DateTime(System.currentTimeMillis()/1000);
        dt.foo();
    }
}