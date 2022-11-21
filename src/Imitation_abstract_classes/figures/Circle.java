package Imitation_abstract_classes.figures;

public class Circle extends Figures{
    private double radius ;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "Circle" + this.radius;
    }
}

