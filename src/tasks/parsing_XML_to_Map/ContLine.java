package tasks.parsing_XML_to_Map;

public class ContLine {
    String codeId;
    int nomTyp, cnt;

    public ContLine(String codeId, int nomTyp, int cnt) {
        this.codeId = codeId;
        this.nomTyp = nomTyp;
        this.cnt = cnt;
    }

    public String getCodeId() {
        return codeId;
    }

    public int getNomTyp() {
        return nomTyp;
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public String toString() {
        return "ContLine{" +
                "codeId='" + codeId + '\'' +
                ", nomTyp=" + nomTyp +
                ", cnt=" + cnt +
                '}';
    }
}
