package tasks.texuna;

public class Row {

    String num, date, name, all;
    int len_num, len_date, len_name;

    public Row(String row) {// на вход передается строка
        int begin = 0;
        int end;
        all = row;

        end = row.indexOf('\t');
        this.num = row.substring(begin, end);//(сканируем с нуля до первого пробела)
        len_num = num.length();

        begin = end + 1;
        end = row.indexOf('\t', begin);//(сканируем со след. символа после первого пробела до второго пробела)
        this.date = row.substring(begin, end);
        len_date = date.length();


        begin = end + 1;
        this.name = row.substring(begin);//(сканируем со след. символа после второго пробела до конца строки)
        len_name = name.length();
    }

//    @Override
//    public String toString() {
//        return "| " + num + " | " + date + " | " + name + " |";
//    }

    public void print() {
        char []arrNum = num.toCharArray();
        char []arrDate = date.toCharArray();
        char []arrName = name.toCharArray();

        String s1 = null;

        if (num.length() == 8 & date.length() == 7 & name.length() == 7) {
            System.out.println("| " + num + " | " + date + " | " + name + " |");
        }
        if (date.length() > 0 & date.length() <= 7 & name.length() <= 7) {
            System.out.printf("| %-8s | %-7s | %-7s |\n", num, date, name);
        }
        if (date.length() > 0 & date.length() <= 7 & name.length() > 7) {
            System.out.printf("| %-8s | %-7s | %-7s |\n", num, date, String.copyValueOf(arrName, 0, 6));
            System.out.printf("| %-8s | %-7s | %-7s |\n", " ", date, String.copyValueOf(arrName, 7, arrName.length - 7));
        }
        if (date.length() > 7 && name.length() > 7) {
            System.out.printf("| %-8s | %-7s | %-7s |\n", num, String.copyValueOf(arrDate, 0, 6), String.copyValueOf(arrName, 0, 6));
            System.out.printf("| %-8s | %-7s | %-7s |\n", " ", String.copyValueOf(arrDate, 7, arrDate.length - 7), String.copyValueOf(arrName, 7, arrDate.length - 7));
        }
    }

    public String getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getLen_num() {
        return len_num;
    }

    public int getLen_date() {
        return len_date;
    }

    public int getLen_name() {
        return len_name;
    }
}
