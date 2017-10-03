package tasks.parsing_XML_to_Map;


public class Nom {
    String name, code, dsc;

    public Nom(String name, String code, String dsc) {
        this.name = name;
        this.code = code;
        this.dsc = dsc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }
}
