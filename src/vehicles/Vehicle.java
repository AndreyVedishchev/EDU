package vehicles;


public class Vehicle {
    int maxspeed;
    char type;//A-air, G-Ground, W -water
    int capacity;
    int passenger;
    int fuelConsumption;//сделать private или protected и организовать доступ
    //fuelType - class !! (тип, цена....)
    //сравниить эффективность авто и самолета по цене на 1 пассажира

    Vehicle(){}

    Vehicle(int maxspeed, char type, int capacity, int passenger, int fuelConsumption) {
        this.maxspeed = maxspeed;
        this.type = type;
        this.capacity = capacity;
        this.passenger = passenger;
        this.fuelConsumption = fuelConsumption;
    }
}
