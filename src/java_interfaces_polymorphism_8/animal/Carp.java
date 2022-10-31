package java_interfaces_polymorphism_8.animal;

public class Carp extends Animal implements Squama,Swim {
    public Carp(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String Speak() {
        return "Carp: Speak oooooooooooooooooooooooooooooooooooo";
    }

    @Override
    public String Eat() {
        return "Carp: Eat worm ";
    }
}
