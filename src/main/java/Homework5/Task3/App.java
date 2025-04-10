package Homework5.Task3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("Suv", 1998, 1900),
                new Car("Truck", 2005, 8000),
                new Car("Sedan", 2018, 2100),
                new Car("Suv", 2023, 1900)
        };
        Car.getCarByYearOfProduction(cars, 2018);
        System.out.println(Arrays.toString(cars));
        Car.sortCarsByYear(cars);
        System.out.println(Arrays.toString(cars));
    }
}
