package Homework7.Task1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("CT001", 55, 84, "CT87345093"));
        employees.add(new ContractEmployee("CT002", 55, 120, "CT87378093"));
        employees.add(new ContractEmployee("CT003", 55, 180, "CT87312393"));
        employees.add(new SalariedEmployee("SE001", 8400, "SS87345093"));
        employees.add(new SalariedEmployee("SE002", 10000, "SS87543905"));

        for (Employee e : employees) {
            e.print();
        }
    }
}
