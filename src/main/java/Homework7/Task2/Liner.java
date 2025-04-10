package Homework7.Task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
    }

    @Override
    void isSailing() {
        System.out.println("Sailing slow...");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    @Override
    public void print() {
        System.out.println(getPassengers() + " passengers on liner with " + floors + " floors");
        isSailing();
    }
}
