package tasks.DateTime;

public class DateTime {

    final static long MSECOND_IN_DAY = 86400000;
    long time;
    int cnt = 1970;

    public DateTime(long time) {
        this.time = time;
    }

    //Конструктор из long 1495305987725
    //Точка отсчета 01.01.1970 00:00:00.0000

    public int getYear() {//возвращает год
        while (time > 0) {
            if (cnt % 400 == 0 | cnt % 4 == 0) {//проверка на високосный год
                time -= (MSECOND_IN_DAY * 366);
            } else {
                time -= (MSECOND_IN_DAY * 365);
            }cnt++;
        }cnt -= 1;
        return cnt;
    }

    public void foo() {

        int month = 0;
        int index = 0;
        double restDays;

        if (cnt % 400 == 0 | cnt % 4 == 0) {
            double restMsec = (MSECOND_IN_DAY * 366) + time;
            restDays = (restMsec/1000/60/60/24) + 1;
            if (restDays > 1 & restDays < 32) {month = 1; index = 0;}
            if (restDays > 31 & restDays < 61) {month = 2; index = 31;}
            if (restDays > 60 & restDays < 92) {month = 3; index = 60;}
            if (restDays > 91 & restDays < 122) {month = 4; index = 91;}
            if (restDays > 121 & restDays < 153) {month = 5; index = 121;}
            if (restDays > 153 & restDays < 183) {month = 6; index = 152;}
            if (restDays > 182 & restDays < 214) {month = 7; index = 182;}
            if (restDays > 213 & restDays < 245) {month = 8; index = 213;}
            if (restDays > 244 & restDays < 275) {month = 9; index = 244;}
            if (restDays > 274 & restDays < 306) {month = 10; index = 274;}
            if (restDays > 305 & restDays < 336) {month = 11; index = 305;}
            if (restDays > 335 & restDays < 367) {month = 12; index = 335;}
        }else {
            double restMsec = (MSECOND_IN_DAY * 365) + time;//прошло миллисекунд с начала года
            restDays = (restMsec/1000/60/60/24) + 1;//число дней с начала года
            if (restDays > 1 & restDays < 32) {month = 1; index = 0;}
            if (restDays > 31 & restDays < 60) {month = 2; index = 31;}
            if (restDays > 59 & restDays < 91) {month = 3; index = 59;}
            if (restDays > 90 & restDays < 121) {month = 4; index = 90;}
            if (restDays > 120 & restDays < 152) {month = 5; index = 120;}
            if (restDays > 152 & restDays < 182) {month = 6; index = 151;}
            if (restDays > 181 & restDays < 213) {month = 7; index = 181;}
            if (restDays > 212 & restDays < 244) {month = 8; index = 212;}
            if (restDays > 243 & restDays < 274) {month = 9; index = 243;}
            if (restDays > 273 & restDays < 305) {month = 10; index = 273;}
            if (restDays > 304 & restDays < 335) {month = 11; index = 304;}
            if (restDays > 334 & restDays < 366) {month = 12; index = 334;}
        }
            double date = restDays - index;
            double hours = (date - (int)date) * 24;
            double minutes = (hours - (int)hours) * 60;
            double seconds = (minutes - (int)minutes) * 60;
            double milliseconds = (seconds - (int)seconds) * 1000;
            System.out.println((int)date+"."+month+"."+cnt+" "+(int)hours+":"+(int)minutes+":"+(int)seconds+"."+(int)milliseconds);
    }

    public static void main(String[] args) {
        DateTime dt = new DateTime(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        dt.getYear();
        dt.foo();
    }
}