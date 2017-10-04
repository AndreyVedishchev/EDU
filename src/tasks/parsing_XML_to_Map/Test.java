package tasks.parsing_XML_to_Map;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Андрей on 04.10.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        Map<String, Nom> map = Parser.fileToMap(new File("./src/tasks/parsing_XML_to_Map/nom20141201130607.xml"));

        //System.out.println(map);

        for (String s : map.keySet()) {
            //System.out.println(s + ": " + map.get(s));
        }

        for (Map.Entry<String, Nom> stringNomEntry : map.entrySet()) {
            System.out.println(stringNomEntry.toString());
        }

    }
}
