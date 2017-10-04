package tasks.parsing_XML_to_Map;


public class Nom {
    private String name, code, dsc;

    public Nom(String name, String code, String dsc) {
        this.name = name;
        this.code = code;
        this.dsc = dsc;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDsc() {
        return dsc;
    }

    @Override
    public String toString() {
        return "Nom{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", dsc='" + dsc + '\'' +
                '}';
    }
}
