package tasks.eventTimeTable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

class TimeTable {

    static Date startDate, sysdate;
    static String []days;
    static int addTime;

    TimeTable(String...days) {
        new TimeControl1().start();
        TimeTable.days = days;
    }

    TimeTable(String start, int addTime) throws ParseException {
        new TimeControl().start();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        startDate = sdf.parse(start);
        TimeTable.addTime = addTime;
    }

    TimeTable() {
        sysdate = new Date();
        String type = "'заданное время'";
        event(type);
    }

    static class TimeControl extends Thread {
        String type = "'периодическое выполнение'";
        @Override
        public void run() {
            Calendar cStart = Calendar.getInstance();
            try {
                while (true) {
                    sleep(1000);
                    sysdate = new Date();

                    if (startDate.before(sysdate)) {
                        startDate = sysdate;
                    }
                    cStart.setTime(startDate);

                    if (Objects.equals(sysdate.toString(), startDate.toString())) {
                        event(type);
                        cStart.add(Calendar.HOUR, addTime);
                        startDate = cStart.getTime();
                    }
                    sysdate = null;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class TimeControl1 extends Thread {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        String s, type = "'дни недели'";

        @Override
        public void run() {
            try {
                while(true) {
                    sysdate = new Date();
                    calendar.setTime(sysdate);
                    s = simpleDateFormat.format(calendar.getTime());
                    try {
                        for (int i = 0; i < days.length; i++) {

                            if (Days.valueOf(days[i].toLowerCase()).toString().equals(days[i].toLowerCase())
                                    && s.toLowerCase().equals(days[i].toLowerCase())) {
                                    event(type);
                            }
                        }
                        sysdate = null;
                        sleep(86400000);

                    } catch (IllegalArgumentException ex) {
                       ex.printStackTrace();
                        System.out.println("День недели указан не корректно!");
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static synchronized void event(String type) {
        System.out.println("Событие выполнено типом расписания " + type + " в " + sysdate);
    }
}
