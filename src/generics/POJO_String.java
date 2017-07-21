package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
public class POJO_String {
    private String[] data;

    private int current = 0;
    public POJO_String(int size){
        data = new String[size];
    }

    public void put(String element) {
        data[current] = element;
        current++;
    }

    public void print(){

    }
}
