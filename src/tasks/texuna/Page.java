package tasks.texuna;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private List<Entry> entryList = new ArrayList<>();
    private Entry header;
    private String delim;
    private int height, width;

    public Page(Entry header, int height, int width) {
        this.header = header;
        this.height = height;
        this.width = width;

        char[] buff = new char[width];
        for (int i = 0; i < width; i++) {
            buff[i] = '-';
        }
        delim = new String(buff);
    }

    @Deprecated
    public void setEntryList(List<Entry> entryList){
        this.entryList = entryList;
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
        //1= заголовок
        //entry.height + 1 = запись

        int ret = 1;

        for (Entry entry : entryList) {
            ret += entry.getHeight() + 1;
        }

        return ret;
    }
}
