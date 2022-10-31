package java_interfaces_polymorphism_8.animal;

public class Pigeon extends Animal implements Fly,Feathers{
    public Pigeon(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String Speak() {
        return "Pigeon: Speak kyr kur";
    }

    @Override
    public String Eat() {
        return "Pigeon: Eat seed ";
    }
}
