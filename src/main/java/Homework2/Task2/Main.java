package Homework2.Task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(10, 10, "Kate");
        Employee employee2 = new Employee(10, 20, "Andrii");
        Employee employee3 = new Employee(10, 10, "Marcella");

        System.out.println(employee1);
        System.out.println(employee1.getBonuses());
        System.out.println(employee2);
        System.out.println(employee2.getBonuses());
        System.out.println(employee3);
        System.out.println(employee3.getBonuses());

        System.out.println(Employee.getTotalSum());
    }
}
