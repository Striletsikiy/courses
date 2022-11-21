package Imitation_abstract_classes.animal;

import Imitation_abstract_classes.animal.Animal;

public class Lion extends Animal {

    @Override
    public void setSpeak() {
        System.out.println("Lion Speak rrrrrrrr");

    }

    @Override
    public void setEat() {
        System.out.println("the lion eats buffalo, antelope, horse, impala and zebra");
    }

    @Override
    public void setToRun() {
        System.out.println("Lion To Run " + 42 + " km hour");

    }

    @Override
    public void setSleep() {
        System.out.println("Lion sleep " + 8 + " hours");
    }
}
