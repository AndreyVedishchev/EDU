package vehicles;

public class AirPlane extends Vehicle{
    //add attributes
    double fuelcost;

    public AirPlane(int maxspeed, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, 'A', capacity, passenger, fuelConsumption);//вызов конструктора суперкласса!!
        setFuelcost(fuelcost);
    }

    public void setFuelcost(double fuelcost) {
        this.fuelcost = 31.5;
    }

    public double getFuelcost() {
        return fuelcost;
    }

    public void calculationAir() {
        double c = fuelConsumption / maxspeed * 100 * getFuelcost() / capacity;
        System.out.println(c + " цена перелета 100 км для 1 пассажира");
    }
}
