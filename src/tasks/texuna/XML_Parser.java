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

public class XML_Parser {

    public XML_Parser() throws ParserConfigurationException, IOException, SAXException {
        List<String> titles = new ArrayList<>();
        List<Integer> widths = new ArrayList<>();


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("./src/tasks/texuna/settings.xml"));

        NodeList nodeList1 = document.getElementsByTagName("page");

        for (int i = 0; i < nodeList1.getLength(); i++) {
            Element elm = (Element) nodeList1.item(i);
            int g = Integer.parseInt(elm.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue());
            int f = Integer.parseInt(elm.getElementsByTagName("height").item(0).getChildNodes().item(0).getNodeValue());

        }

        NodeList nodeList2 = document.getElementsByTagName("column");
        for (int j = 0; j < nodeList2.getLength(); j++) {
            Element el = (Element) nodeList2.item(j);
            titles.add(el.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
            widths.add(Integer.parseInt(el.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue()));
        }

    }
}
