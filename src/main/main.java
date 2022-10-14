package main;

import basic_java.BasicJava;
import statements_and_loops.Task;
import work_with_text_and_arrays.Task2;
import java.util.Arrays;
import java.util.LinkedHashSet;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        BasicJava basicJava = new BasicJava();
        basicJava.calculate();

        Task task = new Task();
        task.comparingTwoNumbers();

        Scanner scanner = new Scanner(System.in);

        task.sumOfNaturalNumbers(scanner);
        task.factorial(scanner);
        task.distanceBetweenTwoPoints(scanner);
        task.mathOperations(scanner);
//        task.theSumOfTheDigits0fAnInteger();
//        task.tenYearNumber(int decimal);

        Task2 task2 = new Task2();
        task2.qw();
        task2.er();
        task2.rt();
        task2.averageValue();
        task2.maxMin();
        task2.equalityChecks();
        task2.DeleteAnElemenFromAnArray();
        task2.stringPerNumber();
        task2.duplicateElementsInAnArray();


    }
   }

