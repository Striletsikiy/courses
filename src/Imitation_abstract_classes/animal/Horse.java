package Imitation_abstract_classes.animal;

import Imitation_abstract_classes.animal.Animal;

public class Horse extends Animal {
    @Override
    public void setSpeak() {
        System.out.println("Horse Speak gooooooooo");
    }

    @Override
    public void setEat() {
        System.out.println("the horse eats grass");
    }

    @Override
    public void setToRun() {
        System.out.println("Horse To Run " + 46 + " km hour");

    }

    @Override
    public void setSleep() {
        System.out.println("Horse sleep " + 9 + " hours");

    }
}
