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

    public int getYear() {//возвращает наименование года
        while (time > 0) {
            if (cnt % 400 == 0 | cnt % 4 == 0) {//проверка на високосный год
                time = time - (MSECOND_IN_DAY * 366);
            } else {
                time = time - (MSECOND_IN_DAY * 365);
            }cnt++;
        }cnt -= 1;
        System.out.println(cnt);
        return cnt;
    }

    public void foo() {
        System.out.println(time);
        int month = 0;
        int index = 0;
        if (cnt % 400 == 0 | cnt % 4 == 0) {
            double restMsec = (MSECOND_IN_DAY * 366) + time;
            double restDays = (restMsec/1000/60/60/24) + 1;
//            if (restDays > 1 & restDays < 32) {month = 1; index = 0;}
//            if (restDays > 31 & restDays < 60) {month = 2; index = 31;}
//            if (restDays > 59 & restDays < 91) {month = 3; index = 59;}
//            if (restDays > 90 & restDays < 121) {month = 4; index = 90;}
//            if (restDays > 120 & restDays < 152) {month = 5; index = 120;}
//            if (restDays > 152 & restDays < 182) {month = 6; index = 151;}
//            if (restDays > 181 & restDays < 213) {month = 7; index = 181;}
//            if (restDays > 212 & restDays < 244) {month = 8; index = 212;}
//            if (restDays > 243 & restDays < 274) {month = 9; index = 243;}
//            if (restDays > 273 & restDays < 305) {month = 10; index = 273;}
//            if (restDays > 304 & restDays < 335) {month = 11; index = 304;}
//            if (restDays > 334 & restDays < 366) {month = 12; index = 334;}
        }else {
            double restMsec = (MSECOND_IN_DAY * 365) + time;//прошло миллисекунд с начала года
            double restDays = (restMsec/1000/60/60/24) + 1;//число дней с начала года
            System.out.println(restDays);
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

            double date = restDays - index;//число
            double hours = (date - (int)date) * 24;
            System.out.println(cnt+" "+month+" "+date+" "+hours);
        }
    }

    public static void main(String[] args) {
        DateTime dt = new DateTime(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println();

        dt.getYear();
        dt.foo();
    }
}