package tasks.texuna;

import java.util.*;

public class Entry {
    private List<String> fields = new ArrayList<String>();
    private List<Integer> widths = new ArrayList<Integer>();
    private int height;
    private String formatedEntry;


    public Entry(String row, char delim, List<Integer> widths){
        this.widths = widths;
        row = row + delim;

        StringBuffer buffer = new StringBuffer();

        for (char c : row.toCharArray()) {
            if (c != delim){
                buffer.append(c);
            }
            else {
                fields.add(buffer.toString());
                buffer = new StringBuffer();
            }
        }

        this.height = CalcHeight();


    }

    private int CalcHeight(){
        int curr;
        int ret = 1;
        if (!(fields.size() == widths.size())) {
            throw new IllegalArgumentException("Указано неверное число колонок!");
        }

        for (int i = 0; i < fields.size(); i++) {

            curr = (int) Math.ceil((double) fields.get(i).length()/widths.get(i));
            ret = Math.max(ret, curr);

        }

        return ret;
    }

    public void printEntry(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < fields.size(); j++) {
                System.out.print("| ");
                String s;
                s = lPad(fields.get(j), widths.get(j)*height);
                s = s.substring(i*widths.get(j), (i+1)*widths.get(j));
                System.out.print(s + " ");
                //lPad(fields.get(j), widths.get(j)).substring(0 , widths.get(j));
            }
            System.out.print("|");
            System.out.println();


        }
    }



    public static String lPad(String s, int n){
        return String.format("%-" + n + "s", s);
    }

    public int getHeight() {
        return height;
    }
}
