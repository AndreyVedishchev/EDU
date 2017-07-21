package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
public class Gen<V> {
    private V[] data;

    private int current = 0;

    public Gen(V[] data) {
        this.data = data;
    }

    public void put(V element) {
        data[current] = element;
        current++;
    }

    public void print(){

    }
}
