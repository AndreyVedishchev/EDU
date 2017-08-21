package tasks.texuna;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        File outFile = new File("./src/tasks/texuna/outTexuna.txt");
        outFile.createNewFile();

        FileOutputStream fs = new FileOutputStream(outFile);
        PrintStream ps = new PrintStream(fs);
        //System.setOut(ps);

        char delim = '\t';
        List<Entry> entryList;
        List<Page> pageList = new ArrayList<Page>();

        XML_Parser prs = new XML_Parser();

        StringBuffer headerString = new StringBuffer();
        for (String title : prs.titles) {
            headerString = headerString.append(title);
            headerString = headerString.append(delim);
        }

        Entry header = new Entry(headerString.substring(0,headerString.length() - 1), delim, prs.widths);
        EntryParser entryParser = new EntryParser(delim, prs.widths);
        entryList = entryParser.parse(new File("./src/tasks/texuna/text"));

        Page page = null;
        for (Entry entry : entryList) {
            if ((page == null) || !page.addEntry(entry)){
                page = new Page(header, prs.g);
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
