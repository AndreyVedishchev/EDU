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

class Parser {


    static Map<String, Nom> map;
    static String key, nName, nDsc;


    static Map<String, Nom> fileToMap (File file) throws ParserConfigurationException, IOException, SAXException {
        map = new HashMap<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);


        NodeList nodeList = document.getElementsByTagName("NOM");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element elm = (Element) nodeList.item(i);
            key = elm.getElementsByTagName("CODE").item(0).getChildNodes().item(0).getNodeValue();
            nName = elm.getElementsByTagName("NAME").item(0).getChildNodes().item(0).getNodeValue();
            nDsc = elm.getElementsByTagName("DSC").item(0).getChildNodes().item(0).getNodeValue();
            map.put(key, new Nom(nName, key, nDsc));
        }
        return map;
    }

}
