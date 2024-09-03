import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        int choice;
        Scanner sc = new Scanner(System.in);
        choice 
        switch(choice)
    }
}

class Vehicle{
    private String make;
    private String model;
    private int year;

    public Vehicle(){}
    public Vehicle(String make ,String model, int yaer){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setMake(String make){this.make = make;}
    public void setModel(String model){this.model = model;}
    public void setYear(int year){this.year = year;}

    public String getMake(){return this.make;}
    public String getModel(){return this.model;}
    public int getYear(){return this.year;}

    @Override
    public String toString(){
        return "Make: " + this.make + "\nModel: " + this.model + ";

}

class Car extends Vehicle{
    private int noOfDoors;

    public Car(){}
    public Car(String make, String model, int year, int noOfDoors){
        super(make,model,year);
        this.noOfDoors = noOfDoors;
    }

    public void setnoOfDoors(int noOfDoors){this.noOfDoors = noOfDoors;}
    public void setMake(String make){
        setMake(make);
    }
    public void setModel(String model){
        setModel(model);
    }
    public void setYear(int year){
        setYear(year);
    }

    public void details(){
        System.out.println("Make : "+this.getMake());
        System.out.println("Model :"+this.getModel());
        System.out.println("Year :"+this.getYear());
        System.out.println("No Of Doors :"+this.noOfDoors);
    }
}


class MotorCycle extends Vehicle{
    private boolean hasSideCar;

    public MotorCycle(){}

    public MotorCycle(String make, String model, int year, boolean hasSideCar){
        super(make,model,year);
        this.hasSideCar = hasSideCar;
    }

    public void setMake(String make){setMake(make);}
    public void setModel(String model){setModel(model);}
    public void setYear(int year){setYear(year);}
    public void setHasSideCar(boolean hasSideCar){this.hasSideCar = hasSideCar;}

    public void details()
    {
        System.out.println("Make : "+this.getMake());
        System.out.println("Model :"+this.getModel());
        System.out.println("Year :"+this.getYear());
        System.out.println("HasSideCar :"+ this.hasSideCar);
    }
}