package Homework7.Task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("Driving fast...");
    }

    @Override
    public void print() {
        System.out.println("Motorcycle with " + getPassengers() + " passenger could drive " + maxSpeed + " kilometers per hour");
        drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
