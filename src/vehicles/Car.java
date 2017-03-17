package vehicles;

public class Car extends Vehicle{
    int fuelcap;//объем бака -> метод по расчету макс дальности! подумать, где его разместить в этом классе или в супере
    //add attributes
    double fuelcostauto;

    public Car(int maxspeed, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, 'G', capacity, passenger, fuelConsumption);//вызов конструктора суперкласса!!
        setFuelcap(fuelcap);
        setFuelcostauto(fuelcostauto);
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = 40;
    }

    public void setFuelcostauto(double fuelcostauto) {
        this.fuelcostauto = 36;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public double getFuelcostauto() {
        return fuelcostauto;
    }

    public void maxWay() {
        double w = getFuelcap() / fuelConsumption * 100;// расстояние пути на одном баке
        System.out.println(w + " расстояние пути на одном баке");
    }
}
