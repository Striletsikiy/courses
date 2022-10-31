package java_interfaces_polymorphism.animal;

public class Dog extends Animal implements opportunities{
    public Dog(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String setSpeak() {
        return "Dog: Speak gggaagga";
    }

    @Override
    public String setEat() {
        return "Dog: Eat meat ";
    }
}
