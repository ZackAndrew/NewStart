package Homework7.Task2;

public abstract class WaterVehicle extends Passenger implements Vehicle{
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
