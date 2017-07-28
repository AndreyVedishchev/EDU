package tasks.texuna2;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("./src/tasks/texuna2/settings.xml"));

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
        entryList = entryParser.parse(new File("./src/tasks/texuna2/text"));//передаем в коллекцию Entry распарсеный файл


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
