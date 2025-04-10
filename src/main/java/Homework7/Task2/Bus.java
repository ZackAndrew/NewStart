package Homework7.Task2;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("Driving slow...");
    }

    @Override
    public void print() {
        System.out.println("Bus route with "+ getPassengers()+ " passengers is- "+route);
        drive();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
