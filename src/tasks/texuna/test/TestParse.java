package tasks.texuna.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestParse {
    BufferedReader bf;
    List<TestEntry> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        TestParse tp = new TestParse();
        String str = null;
        do {
            str = tp.bf.readLine();
            if (str != null) tp.list.add(new TestEntry(str));
        } while (str != null);

        System.out.println(tp.list.size());
    }

    public TestParse() throws FileNotFoundException {
        bf = new BufferedReader(new FileReader("./src/tasks/texuna/test/testforparse"));
    }



}
