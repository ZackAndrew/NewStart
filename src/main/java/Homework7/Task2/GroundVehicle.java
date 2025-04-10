package Homework7.Task2;

public abstract class GroundVehicle extends Passenger implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
