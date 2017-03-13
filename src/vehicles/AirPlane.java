package vehicles;

/**
 * Created by User on 13.03.2017.
 */
public class AirPlane extends Vehicle{
    //add attributes


    public AirPlane(int maxspeed, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, 'A', capacity, passenger, fuelConsumption);//вызов конструктора суперкласса!!
    }
}
