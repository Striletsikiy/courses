package java_interfaces_polymorphism_8.animal;

public class Cat extends Animal implements Speed,Claws,Wool{
    public Cat(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String Speak() {
        return "Cat: Speak mmyv";
    }

    @Override
    public String Eat() {
        return "Cat: Eat fish ";
    }
}
