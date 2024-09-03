// Create a class AreaCalculator that contains overloaded methods to calculate the area of different shapes. Implement methods to calculate the area of:
//     1. A circle (given its radius)
//     2. A rectangle (given its width and height)
//     3. A triangle (given its base and height

package Tests.test1;

public class main {
    public static void main(String[] args){
        //creating an object
        AreaCalculator ac = new AreaCalculator();
        System.out.println(ac.area(5.5));//Circle
        System.out.println(ac.area(15.5,12.3));//Rectangle
        System.out.println(ac.area(10,23, true));//Triangle
    }
    
}

class AreaCalculator{
    //for circle
    public double area(double radius){
        return 3.14f * radius * radius;
    }

    //for rectangle
    public double area(double length, double bridth){
        return length * bridth;
    }

    //for triangle
    public double area(double base,double height, boolean isTriangle){
        if(isTriangle){
            return 0.5 * base * height;
        }
        System.out.println("Invalid Input\n");
        return 0;
    }
}
