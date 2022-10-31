package java_interfaces_polymorphism_8;

import java_interfaces_polymorphism_8.animal.*;
import java_interfaces_polymorphism_8.musicians.Musician1;
import java_interfaces_polymorphism_8.musicians.Musician2;
import java_interfaces_polymorphism_8.musicians.Musician3;

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
        System.out.println(cat.Eat() + cat.Speak() + cat.Speed() + cat.Claws() + cat.Wool());
        System.out.println(dog.Eat() + dog.Speak() + dog.Speed() + dog.Wool());
        System.out.println(pigeon.Eat() + pigeon.Speak() + pigeon.Fly() + pigeon.Feathers());
        System.out.println(carp.Eat() + carp.Speak() + carp.Swim() + carp.Squama());
        System.out.println(lion.Eat() + lion.Speak() + lion.Speed() + lion.Claws() + lion.Wool());
        System.out.println(Arrays.toString(animal));




    }
}
