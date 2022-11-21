package Imitation_abstract_classes.figures;

public class Triangle extends Figures{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea(){
        double s = calculatePerimeter();
        return Math.sqrt(s * (s - a) * ( s-b ) * (s - c));
    }
    @Override
    public String toString(){
        return "Triangle: " + this.a + " " + this.b + " " + this.c;
    }
}
