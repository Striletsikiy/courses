package main;

import basic_java.BasicJava;
import statements_and_loops.Task;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

//        BasicJava basicJava = new BasicJava();
//        basicJava.calculate();

        Task task = new Task();
        task.comparingTwoNumbers();

        Scanner scanner = new Scanner(System.in);

        task.sumOfNaturalNumbers(scanner);
        task.factorial(scanner);
        task.distanceBetweenTwoPoints(scanner);
        task.mathOperations(scanner);

    }
   }

