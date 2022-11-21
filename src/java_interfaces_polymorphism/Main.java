package java_interfaces_polymorphism;

import java_interfaces_polymorphism.animal.*;
import java_interfaces_polymorphism.musicians.Musician1;
import java_interfaces_polymorphism.musicians.Musician2;
import java_interfaces_polymorphism.musicians.Musician3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Musician1 musician1 = new Musician1();
        System.out.println("musician1 " + musician1.drum());
        System.out.println("musician1 " + musician1.piano());
        System.out.println("musician1 " + musician1.violin());
        Musician2 musician2 = new Musician2();
        System.out.println("musician2 " + musician2.piano() + musician2.violin());
        Musician3 musician3 = new Musician3();
        System.out.println("musician3 " + musician3.drum());
        System.out.println(" \n \n \n ");





        Cat cat = new Cat(3, 12);
        Dog dog = new Dog(5, 21);
        Pigeon pigeon = new Pigeon(2, 5);
        Carp carp = new Carp(4, 18);
        Lion lion = new Lion(5, 58);

        Animal animal[] = {cat,dog,pigeon,carp,lion};
        Arrays.sort(animal);
        System.out.println(cat.setEat() + cat.setSpeak() + cat.Speed() + cat.Claws());
        System.out.println(dog.setEat() + dog.setSpeak() + dog.Speed() + dog.Wool());
        System.out.println(pigeon.setEat() + pigeon.setSpeak() + pigeon.Fly() + pigeon.Feathers());
        System.out.println(carp.setEat() + carp.setSpeak() + carp.Swim() + carp.Squama());
        System.out.println(lion.setEat() + lion.setSpeak() + lion.Speed() + lion.Сliques());
        System.out.println(Arrays.toString(animal));




    }
}
