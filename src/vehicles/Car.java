package vehicles;

public class Car extends Vehicle{
    //объем бака -> метод по расчету макс дальности! подумать, где его разместить в этом классе или в супере
    //add attributes
    // топливо в Vehicle
    @Deprecated
    Car(int maxspeed, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, 'G', capacity, passenger, fuelConsumption);//вызов конструктора суперкласса!!
    }

    Car(int maxspeed, int capacity, int passenger, int fuelConsumption, Fuel fuel, int tankVolume) {
        super(maxspeed, 'G', capacity, passenger, fuelConsumption, fuel, tankVolume);
    }
}