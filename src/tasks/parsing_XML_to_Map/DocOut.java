package tasks.parsing_XML_to_Map;

import java.util.ArrayList;
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


    public DocOut(String idDoc, String date, String shipmentDate, String responsPerson, String customer, String destination, String dsc) {
        this.idDoc = idDoc;
        this.date = date;
        this.shipmentDate = shipmentDate;
        this.responsPerson = responsPerson;
        this.customer = customer;
        this.destination = destination;
        this.dsc = dsc;
        lines = new ArrayList<>();
    }

    public void addLine(ContLine line){
        lines.add(line);
    }
}
