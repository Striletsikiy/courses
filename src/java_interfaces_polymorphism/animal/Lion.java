package java_interfaces_polymorphism.animal;

public class Lion extends Animal implements opportunities {
    public Lion(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String setSpeak() {
        return "Lion: Speak rrrrrrrr";
    }

    @Override
    public String setEat() {
        return "Lion: Eat meat ";
    }


}
