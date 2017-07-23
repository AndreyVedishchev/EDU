package tasks.texuna;

public class Row {

    String num, date, name;
    int len_num, len_date, len_name;

    public Row(String row) {// на вход передается строка
        int begin = 0;
        int end;

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

    @Override
    public String toString() {
        return "| " + num + " | " + date + " | " + name + " |";
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
