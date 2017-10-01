package tasks.parsing_XML_to_Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    private Map<String, String> map;
    String s, d;

    public Parser() throws IOException, SAXException, ParserConfigurationException {

        map = new HashMap<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("./src/tasks/parsing_XML_to_Map/nom20141201130607.xml"));

        NodeList nodeList = document.getElementsByTagName("NOM");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element elm = (Element) nodeList.item(i);
            s = elm.getElementsByTagName("CODE").item(0).getChildNodes().item(0).getNodeValue();
            d = elm.getElementsByTagName("NAME").item(0).getChildNodes().item(0).getNodeValue();
            map.put(s, d);
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        new Parser();
    }
}
