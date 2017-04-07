package vehicles;

public abstract class Vehicle {// это транспортные средства
    protected int maxspeed;
    protected char type;//A-air, G-Ground, W -water
    protected int capacity;
    protected int passenger;
    protected int fuelConsumption;//сделать private или protected и организовать доступ // договоримся, что это л на 100км
    //fuelType - class !! (тип, цена....)
    //сравниить эффективность авто и самолета по цене на 1 пассажира
    //NEW
    protected Fuel fuel;
    protected int fuelLevel;
    private int tankVolume;

    Vehicle(int maxspeed, char type, int capacity, int passenger, int fuelConsumption) {
        this.maxspeed = maxspeed;
        this.type = type;
        this.capacity = capacity;
        this.passenger = passenger;
        this.fuelConsumption = fuelConsumption;
    }

    Vehicle(int maxspeed, char type, int capacity, int passenger, int fuelConsumption, Fuel fuel, int tankVolume) {
        this(maxspeed,type,capacity,passenger,fuelConsumption);//обрати внимание  на эту строку!
        this.fuel = fuel;
        this.tankVolume = tankVolume;
    }

    Vehicle(int maxspeed, char type, int capacity, int passenger, int fuelConsumption, Fuel fuel, int tankVolume, int fuelLevel){
        this(maxspeed,type, capacity,passenger,fuelConsumption,fuel,tankVolume);
        this.fuelLevel = fuelLevel;

    }
    public void setMaxspeed(int maxspeed) {
        if (maxspeed > 0) this.maxspeed = maxspeed;
        else this.maxspeed = 0;
    }

    public void setType(char type) {
        if (type != 'A' | type != 'G' | type != 'W') this.type = 0;
        else this.type = type;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) this.capacity = capacity;
        else this.capacity = 0;
    }

    public void setPassenger(int passenger) {
        if (passenger > 0) this.passenger = passenger;
        else this.passenger = 0;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0) this.fuelConsumption = fuelConsumption;
        else this.fuelConsumption = 0;
    }

    public void setTankVolume(int tankVolume) {
        if (tankVolume > 0) this.tankVolume = tankVolume;
        else this.tankVolume = 0;
    }

    float calcMaxWay() {
        float max;
        max = ((float)tankVolume/fuelConsumption*100);
        return max;
    }

    float calcPriceOfKm(){
        float ret;
        ret =  ((float)this.fuelConsumption/100 * this.fuel.getPrice()/this.capacity);
        return ret;
    }


}