package java_interfaces_polymorphism.animal;

public abstract class Animal implements Comparable<Animal>{
    private int age;
    private int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract String setSpeak();
    public abstract String setEat();

    @Override
    public String toString(){
        return "weight: " + weight + ", age: " + age;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.age);
    }
}

