package Homework7.Task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("Driving is comfortable");
    }

    @Override
    public void print() {
        System.out.println(getPassengers() + " passengers in " + model);
        drive();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
