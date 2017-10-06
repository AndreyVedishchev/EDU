package tasks.parsing_XML_to_Map;


public class ContLine {
    String codeId, nomTyp, cnt;
//    int nomTyp;
//    int cnt;

    public ContLine(String codeId, String nomTyp, String cnt) {
        this.codeId = codeId;
        this.nomTyp = nomTyp;
        this.cnt = cnt;
    }

//    public String getCodeId() {
//        return codeId;
//    }
//
//    public int getNomTyp() {
//        return nomTyp;
//    }
//
//    public int getCnt() {
//        return cnt;
//    }

    @Override
    public String toString() {
        return "ContLine{" +
                "codeId='" + codeId + '\'' +
                ", nomTyp=" + nomTyp +
                ", cnt=" + cnt +
                '}';
    }
}
