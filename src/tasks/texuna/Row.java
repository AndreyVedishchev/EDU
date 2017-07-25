package tasks.texuna;

public class Row {

    String num, date, name;
    double width;

    private static int num_wdh, date_wdh, name_wdh;

    public static void setNum_wdh(int num_wdh) {
        Row.num_wdh = num_wdh;
    }

    public static void setDate_wdh(int date_wdh) {
        Row.date_wdh = date_wdh;
    }

    public static void setName_wdh(int name_wdh) {
        Row.name_wdh = name_wdh;
    }



    public Row(String row) {// на вход передается строка
        int begin = 0;
        int end;


        end = row.indexOf('\t');
        this.num = row.substring(begin, end);//(сканируем с нуля до первого пробела)


        begin = end + 1;
        end = row.indexOf('\t', begin);//(сканируем со след. символа после первого пробела до второго пробела)
        this.date = row.substring(begin, end);



        begin = end + 1;
        this.name = row.substring(begin);//(сканируем со след. символа после второго пробела до конца строки)

        //посчитаем сколько строк будет занимать данная запись
        int widthNum = (int) Math.ceil((double)num.length()/name_wdh);
        int widthDate = (int) Math.ceil((double)date.length()/date_wdh);
        int widthName = (int) Math.ceil((double)name.length()/name_wdh);

        width =  Math.max(widthDate, widthName);
        width =  Math.max(widthNum, width);

    }


    public void print() {
        if (num.length() == num_wdh) {

        }

        if (num.length() > num_wdh){

        }

        if (num.length() < num_wdh){

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


}
