package tasks.texuna2;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        List<Integer> widths = new ArrayList<Integer>();//создание коллекции из значений ширины для каждого столбца
        widths.add(8);
        widths.add(7);
        widths.add(7);
        int pageW = 32;
        int pageH = 12;
        char delim = '\t';
        List<Entry> entryList;//создание коллекции объектов Entry
        List<Page> pageList = new ArrayList<Page>();//создание коллекции объектов Page
        Entry header = new Entry("Номер\tДата\tФИО", delim, widths);//создание шапки
        EntryParser entryParser = new EntryParser(delim, widths);// создаем объект парсера
        entryList = entryParser.parse(new File("./tests/text.tcv"));//передаем в коллекцию Entry распарсеный файл


        Page page = null;
        for (Entry entry : entryList) {

            if ((page == null) || !page.addEntry(entry)){
                page = new Page(header,pageH,pageW);
                page.addEntry(entry);
                pageList.add(page);

            }
        }



        for (Page p : pageList) {

            p.printPage();
            System.out.println("~");
        }
    }
}
