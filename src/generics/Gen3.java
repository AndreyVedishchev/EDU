package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
//ограничения!
public class Gen3<T> {
    T ob;
    T[] arr;

    public Gen3(T ob) {
        this.ob = ob;
    }

    public Gen3(){
//        this.ob = new T(); нельзя создавать объекты переменного типа!
    }

    public void generate(){
//        arr = new T[13]; нельзя создавать массивы ссылок обобщенного типа!
    }
}
