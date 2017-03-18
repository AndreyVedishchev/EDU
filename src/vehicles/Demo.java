package vehicles;

public class Demo {
    public static  void main (String[] args){
        Fuel gasoline = new Fuel("gasoline",40);
        Car ob = new Car(200,5,1, 8);
        Car car = new Car(200,5,1,8, gasoline);
        System.out.println(car.calcPriceOfKm());
    }
}