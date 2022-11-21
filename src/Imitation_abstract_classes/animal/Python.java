package Imitation_abstract_classes.animal;

import Imitation_abstract_classes.animal.Animal;

public class Python extends Animal {
    @Override
    public void setSpeak() {
        System.out.println("Python Speak pssssssssssssss");

    }

    @Override
    public void setEat() {
        System.out.println("pythons eat rats and other small animals");
    }

    @Override
    public void setToRun() {
        System.out.println("Python To Run " + 1 + " m hv");
    }

    @Override
    public void setSleep() {
        System.out.println("Python sleep " + 4 + " hours");

    }
}
