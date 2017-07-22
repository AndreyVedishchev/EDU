package tasks.texuna;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 22.07.2017.
 */
public class FileReaderExample {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Git\\EDU\\src\\tasks\\texuna\\text"));
        String buff;
        List<Row> list = new LinkedList<>();
        while ((buff = reader.readLine()) != null){
            System.out.println(buff);


            System.out.println("!");
        }

    }
}
