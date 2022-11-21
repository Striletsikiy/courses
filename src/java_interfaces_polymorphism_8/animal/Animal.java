package java_interfaces_polymorphism_8.animal;

public abstract class Animal implements Comparable<Animal>{
    private int age;
    private int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public abstract String Speak();
    public abstract String Eat();

    @Override
    public String toString(){
        return "weight: " + weight + ", age: " + age;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.age);
    }
}

