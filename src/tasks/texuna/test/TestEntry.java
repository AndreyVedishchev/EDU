package tasks.texuna.test;

/**
 * Created by Андрей on 01.08.2017.
 */
public class TestEntry {
    int id, num;
    String name, pas;
    char ch = ';';

    TestEntry(String input) {
        String [] s = new String[4];

        int i = 0;
        char []arr = input.toCharArray();
        StringBuffer stb = new StringBuffer();
        for (char c : arr) {
            if (c != ';'){
                stb.append(c);
            }
            else {
                s[i++] = stb.toString();
                stb = new StringBuffer();
            }

        }

        id = Integer.valueOf(s[0]);
        name = s[1];
        num = Integer.valueOf(s[2]);
        pas = s[3];
    }

    void print() {
        System.out.println(id + ". " + name + " " + num + " / " + pas);
    }
}
