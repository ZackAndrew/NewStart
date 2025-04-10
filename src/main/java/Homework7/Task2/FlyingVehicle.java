package Homework7.Task2;

public abstract class FlyingVehicle extends Passenger implements Vehicle{

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();
    abstract void land();
}
