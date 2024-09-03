// Write
// a Java program to create a base class Vehicle with methods
// startEngine() and stopEngine(). Create two subclasses Car and
// Motorcycle. Override the startEngine() and stopEngine() methods in
// each subclass to start and stop the engines differently.



package Tests.test4;

public class main {
    public static void main(String []args){
        Car c = new Car();
        c.start_engine();
        c.stop_engine();

        MotorCycle mc = new MotorCycle();
        mc.start_engine();
        mc.stop_engine();
    }
}


abstract class Vehicle{
    abstract public void start_engine();
    abstract public void stop_engine();
} 

class Car extends Vehicle{
    @Override
    public void start_engine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop_engine() {
        System.out.println("Car engine stopped");
    }
}

class MotorCycle extends Vehicle{
    @Override
    public void start_engine() {
        System.out.println("MotorCycle engine started");
    }

    @Override
    public void stop_engine() {
        System.out.println("MotorCycle engine stopped");
    }
}