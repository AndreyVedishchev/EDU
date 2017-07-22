package generics;

/**
 * Created by Андрей on 21.07.2017.
 */
public class Gen2<T extends Number> {
    T number;

    public Gen2(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double getSum(T a){
        double sum;
        sum = this.number.doubleValue() + a.doubleValue();
        return sum;
    }
}
