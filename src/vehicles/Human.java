package vehicles;

/**
 * Created by User on 20.03.2017.
 */
public class Human implements VehicleMove{
    String name;
    float foodlevel;
    float waterlevel;

    Human(String name){
        this.name = name;
        this.foodlevel = 5;
        this.waterlevel = 10;
    }
    public void move(){
        foodlevel -=0.01;
        waterlevel -=0.2;
    }
    public void stop(){
        System.out.println("Hey");
    }
}
