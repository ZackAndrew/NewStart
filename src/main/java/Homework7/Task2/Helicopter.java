package Homework7.Task2;

public class Helicopter extends FlyingVehicle {
    private int maxHigh;
    private int weight;

    public Helicopter(int passengers, int maxHigh, int weight) {
        super(passengers);
        this.maxHigh = maxHigh;
        this.weight = weight;
    }

    @Override
    void fly() {
        System.out.println("Flying not really fast...");
    }

    @Override
    void land() {
        System.out.println("Landing smoothly");
    }

    @Override
    public void print() {
        System.out.println(weight + " kilograms helicopter with " + getPassengers() + " passengers could fly on " + getMaxHigh() + " meters high");
        fly();
        land();
    }

    public int getMaxHigh() {
        return maxHigh;
    }

    public void setMaxHigh(int maxHigh) {
        this.maxHigh = maxHigh;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
