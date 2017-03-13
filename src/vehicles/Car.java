package vehicles;


public class Car extends Vehicle{
    int fuelcap;//объем бака -> метод по расчету макс дальности! подумать, где его разместить в этом классе или в супере
    //add attributes


    public Car(int maxspeed, int capacity, int passenger, int fuelConsumption) {
        super(maxspeed, 'G', capacity, passenger, fuelConsumption);//вызов конструктора суперкласса!!
    }
}
