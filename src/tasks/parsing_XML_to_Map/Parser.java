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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Parser {

    static String key, nName, nDsc;
    static Map<String, Nom> map;

    static String idDoc, date, shipmentDate, responsPerson, customer, destination, dsc;
    static DocOut docOut;

    static List <ContLine>list;
    static String codeId;
    static String nomTyp, cnt;

    static NodeList dom(File file, String tagname) throws ParserConfigurationException, IOException, SAXException{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);
        NodeList nodeList = document.getElementsByTagName(tagname);
        return nodeList;
    }

    static Map<String, Nom> fileToMap (File file) throws ParserConfigurationException, IOException, SAXException {

        map = new HashMap<>();
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        Document document = builder.parse(file);
//        NodeList nodeList = document.getElementsByTagName("NOM");
        dom(file, "NOM");

        //for (int i = 0; i < nodeList.getLength(); i++) {
        for (int i = 0; i < dom(file, "NOM").getLength(); i++) {

            Element elm = (Element) dom(file, "NOM").item(i);

            key = elm.getElementsByTagName("CODE").item(0).getChildNodes().item(0).getNodeValue();
            nName = elm.getElementsByTagName("NAME").item(0).getChildNodes().item(0).getNodeValue();
            nDsc = elm.getElementsByTagName("DSC").item(0).getChildNodes().item(0).getNodeValue();
            map.put(key, new Nom(nName, key, nDsc));
        }
        return map;
    }

    static DocOut fileToDocOut (File file) throws ParserConfigurationException, IOException, SAXException{

//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        Document document = builder.parse(file);
//        NodeList nodeList = document.getElementsByTagName("DOC_OUT");
        dom(file, "DOC_OUT");

        for (int i = 0; i < dom(file, "DOC_OUT").getLength(); i++) {

            Element elm = (Element) dom(file, "DOC_OUT").item(i);

            idDoc = elm.getElementsByTagName("ID_DOC").item(0).getChildNodes().item(0).getNodeValue();
            date = elm.getElementsByTagName("DATE").item(0).getChildNodes().item(0).getNodeValue();
            shipmentDate = elm.getElementsByTagName("SHIPMENT_DATE").item(0).getChildNodes().item(0).getNodeValue();
            responsPerson = elm.getElementsByTagName("RESPONS_PERS").item(0).getChildNodes().item(0).getNodeValue();
            customer = elm.getElementsByTagName("CUSTOMER").item(0).getChildNodes().item(0).getNodeValue();
            destination = elm.getElementsByTagName("DESTINATION").item(0).getChildNodes().item(0).getNodeValue();
            dsc = elm.getElementsByTagName("DSC").item(0).getChildNodes().item(0).getNodeValue();
        }
        return docOut = new DocOut(idDoc, date, shipmentDate, responsPerson, customer, destination, dsc);
    }

    static ContLine fileToContLine (File file) throws IOException, SAXException, ParserConfigurationException {

        list = new ArrayList();
        dom(file, "CONTENT");

        for (int i = 0; i < dom(file, "CONTENT").getLength(); i++) {

            Element elm = (Element) dom(file, "CONTENT").item(i);

            codeId = elm.getElementsByTagName("CODE").item(0).getChildNodes().item(0).getNodeValue();
            nomTyp = elm.getElementsByTagName("NOM_TYP").item(0).getChildNodes().item(0).getNodeValue();
            cnt = elm.getElementsByTagName("CNT").item(0).getChildNodes().item(0).getNodeValue();
        }

        return new ContLine(codeId, nomTyp, cnt);
    }

}
