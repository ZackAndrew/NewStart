package Homework7.Task2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Sailing fast...");
    }

    @Override
    public void print() {
        System.out.println(getPassengers()+ " passengers on "+volume+" liters boat");
        isSailing();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
