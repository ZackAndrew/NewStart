package Homework6.Task2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aga", 35, 5300));
        employees.add(new Developer("Andrew", 23, 10000, "Java junior developer"));
        for (Employee employee: employees){
            System.out.println(employee.report());
        }
    }
}
