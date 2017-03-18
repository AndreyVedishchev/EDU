package vehicles;

public class Vehicle {
    int maxspeed;
    char type;//A-air, G-Ground, W -water
    int capacity;
    int passenger;
    int fuelConsumption;//сделать private или protected и организовать доступ // договоримся, что это л на 100км
    //fuelType - class !! (тип, цена....)
    //сравниить эффективность авто и самолета по цене на 1 пассажира
    //NEW
    Fuel fuel;

    Vehicle(int maxspeed, char type, int capacity, int passenger, int fuelConsumption) {
        this.maxspeed = maxspeed;
        this.type = type;
        this.capacity = capacity;
        this.passenger = passenger;
        this.fuelConsumption = fuelConsumption;
    }

    Vehicle(int maxspeed, char type, int capacity, int passenger, int fuelConsumption, Fuel fuel) {
        this(maxspeed,type,capacity,passenger,fuelConsumption);//обрати внимание  на эту строку!
        this.fuel = fuel;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
