package generics;

import abstrations.Creature;
import abstrations.Gorilla;
import abstrations.Human;
import abstrations.Mammals;

/**
 * Created by Андрей on 23.08.2017.
 */
public class GenEnt<V extends Creature> {
    V creature;


    public GenEnt(V creature) {
        this.creature = creature;
    }

    public void printSmth(){
        creature.sound();
    }

    public boolean isOlderThan(GenEnt<? extends Gorilla> ob){

        if (this.creature.getAge() > ob.creature.getAge()) return true;
        else return false;

    }
}
