package Imitation_abstract_classes.figures;

public class Rectangle extends Figures {
    private double heaight;
    private double width;
    public Rectangle(double width,double heaight){
        this.heaight = heaight;
        this.width = width;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * (heaight + width);
    }

    @Override
    public double calculateArea() {
        return width * heaight;
    }
    @Override
    public String toString(){
        return "Rectangle: " + this.heaight + " " + this.width ;
    }
}