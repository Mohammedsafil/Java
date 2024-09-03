package Shapes;

public class Sphere extends Circle implements Shape {
    
    public Sphere(double radius){
        super(radius);
    }

    @Override
    public double calculateArea(){
        return 4 * Math.PI * super.radius * super.radius;
    }
    @Override
    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }
}
