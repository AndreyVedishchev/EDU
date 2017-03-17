package vehicles;

public class FuelType extends Vehicle {
    String typeF;//тип топлива petrol, kerosene
    double cost;//цена за литр

    public FuelType(int maxspeed, char type, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, type, capacity, passenger, fuelConsumption);
    }

    public void setTypeF(String typeF) {
        this.typeF = typeF;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTypeF() {
        return typeF;
    }

    public double getCost() {
        return cost;
    }

    public void compare() {
        double m = fuelConsumption / maxspeed * 100 * air.getFuelcost() / capacity;
        double q = ob.getFuelcar() / fuelConsumption * 100;
        if (m > q) {System.out.println("самолет дешевле автомобиля");}
        else {System.out.println("автомобиль дешевле самолета");}
    }
}
