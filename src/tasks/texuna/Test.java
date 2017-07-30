package tasks.texuna;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    //0 - настройки, 1 - исходный, 2 - выходной
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {


        List<String> titles = new ArrayList<>();
        List<Integer> widths = new ArrayList<>();

        File outFile = new File(args[2] +"/outTexuna.txt");
        outFile.createNewFile();

        FileOutputStream fs = new FileOutputStream(outFile);
        PrintStream ps = new PrintStream(fs);
        System.setOut(ps);

        int pageW = 0;
        int pageH = 0;
        char delim = '\t';
        List<Entry> entryList;//создание коллекции объектов Entry
        List<Page> pageList = new ArrayList<Page>();//создание коллекции объектов Page
        //----------------------------------------------перенести в отдельный класс
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(args[0] + "/settings.xml"));

        NodeList nodeList1 = document.getElementsByTagName("page");

        for (int i = 0; i < nodeList1.getLength(); i++) {
            Element elm = (Element) nodeList1.item(i);
            int g = Integer.parseInt(elm.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue());
            int f = Integer.parseInt(elm.getElementsByTagName("height").item(0).getChildNodes().item(0).getNodeValue());

            pageW = g;
            pageH = f;
        }


        NodeList nodeList2 = document.getElementsByTagName("column");
        for (int j = 0; j < nodeList2.getLength(); j++) {
            Element el = (Element) nodeList2.item(j);
            titles.add(el.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
            widths.add(Integer.parseInt(el.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue()));
        }

        //создание коллекции из значений ширины для каждого столбца




        StringBuffer headerString = new StringBuffer();
        for (String title : titles) {
            headerString = headerString.append(title);
            headerString = headerString.append(delim);
        }
        Entry header = new Entry(headerString.substring(0,headerString.length() -1), delim, widths);//создание шапки
        EntryParser entryParser = new EntryParser(delim, widths);// создаем объект парсера
        entryList = entryParser.parse(new File(args[1] + "/text.tcv"));//передаем в коллекцию Entry распарсеный файл

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

        System.out.flush();
        fs.close();

    }
}
