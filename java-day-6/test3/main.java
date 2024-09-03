package test3;

public class main {
    public static void main(String[] args){
        Rectangle rc = new Rectangle(12.4, 23.4);
        System.out.println(rc.calArea());
        System.out.println(rc.calPerimeter());
        System.out.println(rc.checkForSquare());
    }
}

class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double calArea(){
        return width * height;
    }

    public double calPerimeter(){
        return 2 * (width + height);
    }

    public boolean checkForSquare(){
        return width == height;
    }

}
