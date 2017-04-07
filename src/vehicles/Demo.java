package vehicles;

import com.sun.naming.internal.VersionHelper;

public class Demo {
    public static  void main (String[] args){
        Fuel gasoline = new Fuel("gasoline",40);
        Fuel kerosene = new Fuel("kerosene", 32);

        //Car ob = new Car(200,5,1, 8);
        Car car = new Car(200,5,1,8, gasoline, 65, 65);
        Human human = new Human("ED");
        AirPlane air = new AirPlane(850, 160, 1, 306, kerosene, 26020, 20000);

        PrintType(car);
        System.out.println(car.TEST);
        PrintType(human);
        /*System.out.println(car.calcPriceOfKm()+" цена за 1 км на автомобиле");//this = car
        System.out.println(air.calcPriceOfKm()+" цена за 1 км на самолете"); //this = air

        System.out.println(car.calcMaxWay()+" максимальное расстояние на автомобиле");
        System.out.println(air.calcMaxWay()+" максимальное расстояние на самолете");

        if (car.calcPriceOfKm() > air.calcPriceOfKm()) {System.out.println("Путешествие на автомобиле стоит дороже, чем на самолете");}
        else {System.out.println("Путешествие на самолете стоит дороже, чем на автомобиле");}*/
    }

    public static void PrintType(VehicleMove ob){

        ob.move();
        ob.stop();



    }
}