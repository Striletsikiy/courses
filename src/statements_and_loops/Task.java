package statements_and_loops;

import java.util.Scanner;

public class  Task{

    public void comparingTwoNumbers() {
        int q = 24;
        int w = 10;
        System.out.println(q == w);

    }
    public void sumOfNaturalNumbers(Scanner scanner){

        System.out.println("enter 10 numbers");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        int a6 = scanner.nextInt();
        int a7 = scanner.nextInt();
        int a8 = scanner.nextInt();
        int a9 = scanner.nextInt();
        int a10 = scanner.nextInt();
        int result = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 ;
        System.out.println(result);

    }
    public void factorial(Scanner scanner){
        int result = 1;
        int k = scanner.nextInt();
        for (int i = 1; i <= k ; i++) {

            result = result * i;
        }
        System.out.println(result);

    }
    public void distanceBetweenTwoPoints(Scanner scanner){
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        float result =(float) Math.sqrt(Math.pow( x1 - x2 ,2)+Math.pow( y1 - y2 ,2));
        System.out.println(result);

    }
    public  void  mathOperations(Scanner scanner){
        String st = scanner.nextLine() ;
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double result;
        switch(st) {
            case ("+"):
                result = a + b;
                break;
            case ("-"):
                result = a - b;
                break;
            case ("*"):
                result = a * b;
                break;
            case ("/"):
                result = a / b;
                break;
            case ("%"):
                result = a % b;
                break;
            default:
                result = a + b;
                break;
        }
        System.out.println(result);
    }

}
