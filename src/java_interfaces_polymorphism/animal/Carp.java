package java_interfaces_polymorphism.animal;

public class Carp extends Animal implements opportunities{
    public Carp(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String setSpeak() {
        return "Carp: Speak oooooooooooooooooooooooooooooooooooo";
    }

    @Override
    public String setEat() {
        return "Carp: Eat worm ";
    }
}
