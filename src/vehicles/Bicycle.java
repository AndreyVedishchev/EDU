package vehicles;


public class Bicycle extends Vehicle {
    public Bicycle(int maxspeed) {
        super(maxspeed, 'G', 1, 1, 0);
        this.fuel = new Fuel("muscle", 0);
    }
}
