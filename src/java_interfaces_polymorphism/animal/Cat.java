package java_interfaces_polymorphism.animal;

public class Cat extends Animal implements opportunities{
    public Cat(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String setSpeak() {
        return "Cat: Speak mmyv";
    }

    @Override
    public String setEat() {
        return "Cat: Eat fish ";
    }
}
