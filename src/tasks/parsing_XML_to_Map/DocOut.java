package tasks.parsing_XML_to_Map;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DocOut {
    private String idDoc;
    private String date;
    private String shipmentDate;
    private String responsPerson;
    private String customer;
    private String destination;
    private String dsc;
    private List<ContLine> lines;

    public DocOut(String idDoc, String date, String shipmentDate, String responsPerson, String customer, String destination, String dsc, File file)
            throws ParserConfigurationException, SAXException, IOException {

        this.idDoc = idDoc;
        this.date = date;
        this.shipmentDate = shipmentDate;
        this.responsPerson = responsPerson;
        this.customer = customer;
        this.destination = destination;
        this.dsc = dsc;
        this.lines = Parser.fileToContLineList(file);
    }

    public String getIdDoc() {
        return idDoc;
    }

    public String getDate() {
        return date;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public String getResponsPerson() {
        return responsPerson;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDestination() {
        return destination;
    }

    public String getDsc() {
        return dsc;
    }

    public List<ContLine> getLines() {
        return lines;
    }

    public void addLine(ContLine line){
        lines.add(line);
    }

    @Override
    public String toString() {
        return "DocOut{" +
                "idDoc='" + idDoc + '\'' +
                ", date='" + date + '\'' +
                ", shipmentDate='" + shipmentDate + '\'' +
                ", responsPerson='" + responsPerson + '\'' +
                ", customer='" + customer + '\'' +
                ", destination='" + destination + '\'' +
                ", dsc='" + dsc + '\'' +
                ", lines=" + lines +
                '}';
    }
}
