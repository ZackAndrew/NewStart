package Homework6.PracticalTask1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Truck("Volvo", 170, 2020));
        cars.add(new Sedan("Audi", 290, 2018));
        cars.add(new Truck("Mercedes", 140, 2005));

        for (Car car: cars){
            car.printInfoAboutCar();
        }
    }

}
