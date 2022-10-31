package Imitation_abstract_classes.animal;

import Imitation_abstract_classes.animal.Animal;

public class Mouse extends Animal {

    @Override
    public void setSpeak() {
        System.out.println("Mouse Speak pppppp");

    }

    @Override
    public void setEat() {
        System.out.println("the mouse eats small insects, worms, plant seeds and cereals");
    }

    @Override
    public void setToRun() {
        System.out.println("Mouse To Run " + 12 + " km hour");

    }

    @Override
    public void setSleep() {
        System.out.println("Mouse sleep " + 5 + " hours");

    }
}
