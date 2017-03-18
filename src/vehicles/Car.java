package vehicles;

public class Car extends Vehicle{
    int fuelcar;//объем бака -> метод по расчету макс дальности! подумать, где его разместить в этом классе или в супере
    //add attributes
    // топливо в Vehicle
    @Deprecated
    Car(int maxspeed, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, 'G', capacity, passenger, fuelConsumption);//вызов конструктора суперкласса!!
    }

    Car(int maxspeed, int capacity, int passenger, int fuelConsumption, Fuel fuel) {
        super(maxspeed, 'G', capacity, passenger, fuelConsumption, fuel);
    }


    float calcPriceOfKm(){
        float ret;
        ret =  ((float)this.fuelConsumption/100 * this.fuel.getPrice());
        return ret;
    }
    //public void maxWay() {
    //    double w = getFuelcar() / fuelConsumption * 100;// расстояние пути на одном баке
    //    System.out.println(w + " расстояние пути на одном баке");
    //}
}
