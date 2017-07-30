package tasks.texuna;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        int widthPage = 0, heightPage = 0;
        List<String> titles = new ArrayList<>();
        List<Integer> widths = new ArrayList<>();
        int pageW = widthPage;
        int pageH = heightPage;
        char delim = '\t';
        List<Entry> entryList;//создание коллекции объектов Entry
        List<Page> pageList = new ArrayList<Page>();//создание коллекции объектов Page
        //----------------------------------------------перенести в отдельный класс
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("./src/tasks/texuna/settings.xml"));

        NodeList nodeList1 = document.getElementsByTagName("page");

        for (int i = 0; i < nodeList1.getLength(); i++) {
            Element elm = (Element) nodeList1.item(i);
            int g = Integer.parseInt(elm.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue());
            int f = Integer.parseInt(elm.getElementsByTagName("height").item(0).getChildNodes().item(0).getNodeValue());

            widthPage = g;
            heightPage = f;
        }


        NodeList nodeList2 = document.getElementsByTagName("column");
        String []str1 = new String[nodeList2.getLength()];
        int []arrInt2 = new int[nodeList2.getLength()];
        System.out.println(nodeList2.getLength() + " nodeList2.getLength()");
        for (int j = 0; j < nodeList2.getLength(); j++) {
            Element el = (Element) nodeList2.item(j);
            titles.add(el.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
            widths.add(Integer.parseInt(el.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue()));
        }

        //создание коллекции из значений ширины для каждого столбца
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i) + " " + widths.get(i));
        }



        Entry header = new Entry(str1[0] + delim + str1[1] + delim + str1[2], delim, widths);//создание шапки
        EntryParser entryParser = new EntryParser(delim, widths);// создаем объект парсера
        entryList = entryParser.parse(new File("./src/tasks/texuna/text"));//передаем в коллекцию Entry распарсеный файл

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
