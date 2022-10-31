package Imitation_abstract_classes;

import Imitation_abstract_classes.animal.Horse;
import Imitation_abstract_classes.animal.Lion;
import Imitation_abstract_classes.animal.Mouse;
import Imitation_abstract_classes.animal.Python;
import Imitation_abstract_classes.figures.Circle;
import Imitation_abstract_classes.figures.Rectangle;
import Imitation_abstract_classes.figures.Triangle;

public class Main {
    public static void main(String[] args){
        Horse h = new Horse();
        h.setSpeak();
        h.setEat();
        h.setToRun();
        h.setSleep();


        Lion l = new Lion();
        l.setSpeak();
        l.setEat();
        l.setToRun();
        l.setSleep();


        Mouse m = new Mouse();
        m.setSpeak();
        m.setEat();
        m.setToRun();
        m.setSleep();

        Python p = new Python();
        p.setSpeak();
        p.setEat();
        p.setToRun();
        p.setSleep();

        Rectangle R = new Rectangle(4,5);
        System.out.println(R.toString());
        System.out.println("Rectangle " + R.calculatePerimeter() + " " + R.calculateArea());
        Triangle T = new Triangle(3,6,9);
        System.out.println(T.toString());
        System.out.println("Triangle " + T.calculatePerimeter() + " " + T.calculateArea());
        Circle C = new Circle(7.5);
        System.out.println(C.toString());
        System.out.println("Circle " + C.calculateArea() + " " + C.calculatePerimeter());

    }
}
