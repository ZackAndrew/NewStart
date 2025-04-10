package Homework7.PracticalTask1;

import Homework6.Task2.Developer;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Topik"));
        animals.add(new Cat("Murka"));
        animals.add(new Dog("Sharik"));
        for (Animal animal : animals){
            System.out.println(animal.getName());
            animal.voice();
            animal.feed();
        }
    }
}
