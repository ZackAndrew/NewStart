package Homework10.Task2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();

        personMap.put("John", "Smith");
        personMap.put("Alice", "Johnson");
        personMap.put("Bob", "Williams");
        personMap.put("Diana", "Brown");
        personMap.put("Ethan", "Brown");
        personMap.put("Fiona", "Garcia");
        personMap.put("George", "Miller");
        personMap.put("Hannah", "Davis");
        personMap.put("Ivan", "Martinez");
        personMap.put("Julia", "Taylor");

        System.out.println(personMap);

        personMap.remove("Ethan");

        System.out.println(personMap);
    }
}
