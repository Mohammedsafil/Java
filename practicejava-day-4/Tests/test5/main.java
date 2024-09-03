// Write
// a Java program to create a base class Shape with methods draw() and
// calculateArea(). Create two subclasses Circle and Cylinder. Override
// the draw() method in each subclass to draw the respective shape. In
// addition, override the calculateArea() method in the Cylinder
// subclass to calculate and return the total surface area of the
// cylinder.

package Tests.test5;

public class main {
    public static void main(String[] args){
        Circle cr = new Circle(5.5);
        cr.draw();
        System.out.println(cr.area());

        Cylinder cl = new Cylinder(1.5, 10.0);
        cl.draw();
        System.out.println(cl.area());
    }
}


abstract class Shape{
    abstract public void draw();
    abstract public double area();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a cylinder");
    }

    @Override
    public double area(){
        return 2 * Math.PI * radius * (radius + height);
    }
}