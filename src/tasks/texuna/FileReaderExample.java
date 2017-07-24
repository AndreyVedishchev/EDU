package tasks.texuna;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileReaderExample {

    private static void head() {
        System.out.println("| Номер    | Дата    | ФИО     |");
    }

    private static void line() {
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) throws IOException {
//        if (args.length > 0){
//            String filepath = args[0];
//            System.out.println(args[0] + args[3]);
//        }
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vedischevan\\IdeaProjects\\EDU\\src\\tasks\\texuna\\text"));
        String buff;
        int cnt = 0;
        List<Row> list = new LinkedList<>();

        while ((buff = reader.readLine()) != null) {
            list.add(new Row(buff));
            cnt++;
        }

        head();
        line();

        for (Row r: list) {
            r.print();
            //System.out.println(r);
            line();
        }

    }
}
