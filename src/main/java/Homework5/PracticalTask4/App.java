package Homework5.PracticalTask4;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Wiktor", 3, 3400),
                new Employee("Andrii", 3, 5400),
                new Employee("Viki", 2, 3150),
                new Employee("Kate", 2, 7800),
                new Employee("Ada", 1, 11000)
        };
        employees[0].employeesOfCertainDepartment(employees, 3);
        System.out.println(Arrays.toString(employees[0].sortEmployeesBySalary(employees)));
    }

}
