package Homework7.Task2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(3, "BMW M3 touring"));
        vehicles.add(new Motorcycle(1, 280));
        vehicles.add(new Bus(25, "Wroclaw -> Prague"));
        vehicles.add(new Helicopter(3, 2100, 4000));
        vehicles.add(new Plane(150, 6000));
        vehicles.add(new Boat(4, 500));
        vehicles.add(new Liner(3000, 4));

        for (Vehicle v : vehicles){
            v.print();
            System.out.println();
        }
    }
}
