package Homework6.PracticalTask1;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println(model + " is running");
    }

    @Override
    void stop() {
        System.out.println(model + "has stopped");
    }
}
