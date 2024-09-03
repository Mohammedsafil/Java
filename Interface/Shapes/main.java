package Shapes;
import Shapes.*;
public class main {
    public static void main(String[] args){
        Shape s = new Circle(34);
        s.calculateArea();
        s.calculatePerimeter();

        s = new Sphere(20);
        s.calculateArea();
        s.calculatePerimeter();

        s = new Rectangle(23, 89);
        s.calculateArea();
        s.calculatePerimeter();

        s = new Square(5);
        s.calculateArea();
        s.calculatePerimeter();
    }
} 










