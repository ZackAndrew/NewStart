package Homework7.Task2;

public abstract class Passenger {
    private int passengers;

    public Passenger(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
