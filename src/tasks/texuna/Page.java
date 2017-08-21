package tasks.texuna;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Page {
    private List<Entry> entryList = new ArrayList<>();
    private Entry header;
    private String delim;
    private int height;

    public Page(Entry header, int height) throws IOException, SAXException, ParserConfigurationException {
        XML_Parser prs = new XML_Parser();
        this.header = header;
        this.height = height;

        char[] buff = new char[prs.g];
        for (int i = 0; i < prs.g; i++) {
            buff[i] = '-';
        }
        delim = new String(buff);
    }

    public boolean addEntry(Entry entry){
        if (getActualHeight() + entry.getHeight() + 1 <= this.height) {
            entryList.add(entry);
            return true;
        }
        return false;
    }

    public void printPage(){
        header.printEntry();
        for (Entry entry : entryList) {
            System.out.println(delim);
            entry.printEntry();
        }
    }

    public int getActualHeight(){
        int ret = 1;
        for (Entry entry : entryList) {
            ret += entry.getHeight() + 1;
        }
        return ret;
    }
}
