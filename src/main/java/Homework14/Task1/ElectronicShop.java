package Homework14.Task1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectronicShop {
    public static void main(String[] args) {


        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.of(2022, 3, 10), 3500),
                new Product("Phone", LocalDate.of(2021, 5, 15), 4000),
                new Product("Phone", LocalDate.of(2023, 8, 1), 2500),
                new Product("Phone", LocalDate.of(2022, 1, 5), 3200),
                new Product("Laptop", LocalDate.of(2021, 2, 20), 5000),
                new Product("Tablet", LocalDate.of(2023, 6, 30), 1200),
                new Product("Phone", LocalDate.of(2020, 7, 14), 4500),
                new Product("TV", LocalDate.of(2019, 4, 5), 3000),
                new Product("Phone", LocalDate.of(2021, 9, 22), 3100),
                new Product("Phone", LocalDate.of(2022, 2, 11), 2999),
                new Product("Tablet", LocalDate.of(2020, 11, 19), 800),
                new Product("Phone", LocalDate.of(2021, 1, 3), 3700),
                new Product("Phone", LocalDate.of(2023, 2, 1), 3400),
                new Product("Laptop", LocalDate.of(2020, 3, 5), 4100),
                new Product("Phone", LocalDate.of(2022, 7, 12), 5000),
                new Product("Phone", LocalDate.of(2020, 10, 10), 2800),
                new Product("Laptop", LocalDate.of(2022, 5, 8), 4800),
                new Product("Phone", LocalDate.of(2019, 9, 9), 6000),
                new Product("TV", LocalDate.of(2022, 12, 1), 2200),
                new Product("Tablet", LocalDate.of(2023, 5, 15), 1500)
        );

        List<Product> result = Product.filterAndSortProducts(products, "Phone", 3000, 1);

        result.forEach(System.out::println);

        HashMap<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(101, new Employee("Alice", 30));
        employeesMap.put(102, new Employee("Bob", 25));
        employeesMap.put(103, new Employee("Charlie", 35));
        employeesMap.put(104, new Employee("David", 40));
        employeesMap.put(105, new Employee("Eve", 29));
        employeesMap.put(106, new Employee("Charlie", 37));

        EmployeeUtils employees = new EmployeeUtils(45, "Mark", employeesMap);
        employeesMap.forEach((id, Employee)-> System.out.println("id:"+id+" "+ Employee.toString()));

        System.out.println("The most popular name - " + employees.mostPopularName());
    }
}
