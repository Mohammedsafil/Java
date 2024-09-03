package Shapes;

public class Circle implements Shape {
    protected double radius; // Change to protected to allow subclass access

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius; // Getter for radius
    }
}
