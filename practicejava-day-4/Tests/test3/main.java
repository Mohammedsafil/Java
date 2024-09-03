// Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.


package Tests.test3;

public class main {
    public static void main(String []args){

        Rectangle r = new Rectangle(15.3,12.5);
        System.out.println(r.area());

        Circle c = new Circle(5.5);
        
        System.out.println(c.area());

        Triangle t = new Triangle(8.9, 12.4);
        System.out.println(t.area());
    }
}

abstract class Shape{
    public abstract double area();
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14f * radius*radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double bridth;

    public Rectangle(double length, double bridth){
        this.length = length;
        this.bridth = bridth;
    }

    @Override
    public double area(){
        return length*bridth;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        return 0.5 * base * height;
    }
}