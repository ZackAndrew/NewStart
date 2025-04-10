package Homework6.PracticalTask1;

public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void run();

    abstract void stop();

    public void printInfoAboutCar() {
        System.out.println(model + ", " + yearOfProduction + " Max speed " + maxSpeed);
    }
}
