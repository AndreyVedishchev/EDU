package vehicles;

public class AirPlane extends Vehicle{
    //add attributes

    public AirPlane(int maxspeed, int capacity, int passenger, int fuelConsumption, Fuel fuel,  int tankVolume) {
        super(maxspeed, 'A', capacity, passenger, fuelConsumption, fuel, tankVolume);//вызов конструктора суперкласса!!
    }
}