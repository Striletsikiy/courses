package java_interfaces_polymorphism_8.animal;

public class Dog extends Animal implements Speed,Wool {
    public Dog(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String Speak() {
        return "Dog: Speak gggaagga";
    }

    @Override
    public String Eat() {
        return "Dog: Eat meat ";
    }
}
