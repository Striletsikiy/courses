package java_interfaces_polymorphism.animal;

public class Pigeon extends Animal implements opportunities{
    public Pigeon(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String setSpeak() {
        return "Pigeon: Speak kyr kur";
    }

    @Override
    public String setEat() {
        return "Pigeon: Eat seed ";
    }
}
