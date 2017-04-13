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


}
