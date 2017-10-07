package tasks.parsing_XML_to_Map;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        Map<String, Nom> map = Parser.fileToMap(new File("./src/tasks/parsing_XML_to_Map/nom20141201130607.xml"));
        DocOut docOut = Parser.fileToDocOut(new File("./src/tasks/parsing_XML_to_Map/TEST_EXT_0310.xml"));
        List contLine = Parser.fileToContLineList(new File("./src/tasks/parsing_XML_to_Map/TEST_EXT_0310.xml"));

        for (String s : map.keySet()) {
            //System.out.println(s + ": " + map.get(s));
        }

//        for (Map.Entry<String, Nom> stringNomEntry : map.entrySet()) {
//            System.out.println(stringNomEntry.toString());
//        }
//
//        System.out.println(docOut);
        System.out.println(contLine);

    }
}
