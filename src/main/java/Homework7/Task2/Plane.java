package Homework7.Task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Flying fast...");
    }

    @Override
    void land() {
        System.out.println("Landing is hard");
    }

    @Override
    public void print() {
        System.out.println(getPassengers() + " passengers on plane which could fly " + maxDistance + " kilometers");
        fly();
        land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
