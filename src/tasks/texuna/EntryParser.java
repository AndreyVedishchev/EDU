package tasks.texuna;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EntryParser {
    char delim;
    List<Integer> widths;

    public EntryParser(char delim, List<Integer> widths) {
        this.delim = delim;
        this.widths = widths;
    }

    public List<Entry> parse(File file) throws IOException {
        List<Entry> entryList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String buff;

        while ((buff = reader.readLine()) != null) {
            entryList.add(new Entry(buff, delim, widths));
        }
        return entryList;
    }
}
