package vehicles;

public class AirPlane extends Vehicle{
    //add attributes

    public AirPlane(int maxspeed, int capacity, int passenger, int fuelConsumption, Fuel fuel,  int tankVolume, int fuelLevel) {
        super(maxspeed, 'A', capacity, passenger, fuelConsumption, fuel, tankVolume, fuelLevel);//вызов конструктора суперкласса!!
    }
    void move(){
        this.fuelLevel -= 10;
    }
}