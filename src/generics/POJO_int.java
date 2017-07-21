package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
public class POJO_int {
    private int[] data;

    private int current = 0;
    public POJO_int(int size){
        data = new int[size];
    }

//    public void put(int element) {
//        data[current] = element;
//        current++;
//    }

    public void put(Integer element) {
        data[current] = element;
        current++;
    }
    public void print(){
        System.out.println(data);
    }


}
