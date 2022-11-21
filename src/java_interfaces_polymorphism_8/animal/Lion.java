package java_interfaces_polymorphism_8.animal;

public class Lion extends Animal implements Speed,Claws,Wool {
    public Lion(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String Speak() {
        return "Lion: Speak rrrrrrrr";
    }

    @Override
    public String Eat() {
        return "Lion: Eat meat ";
    }


}
