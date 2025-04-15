package Homework10.PracticalTask2;

import java.util.HashMap;

public class IdManagerApp {
    public static void main(String[] args) {
    Employee employeeObj = new Employee();
        HashMap<Integer, Employee> employeesMap = new HashMap<>();

        employeesMap.put(1001, new Employee(1001, "Alice", "Developer", 75000.00, "1990-01-15"));
        employeesMap.put(1002, new Employee(1002, "Bob", "Manager", 88000.50, "1985-03-22"));
        employeesMap.put(1003, new Employee(1003, "Charlie", "Analyst", 72000.00, "1992-07-11"));
        employeesMap.put(1004, new Employee(1004, "Diana", "HR", 65000.75, "1988-12-05"));
        employeesMap.put(1005, new Employee(1005, "Ethan", "QA Engineer", 69000.25, "1993-06-19"));
        employeesMap.put(1006, new Employee(1006, "Fiona", "Designer", 71000.00, "1991-10-30"));
        employeesMap.put(1007, new Employee(1007, "George", "Product Manager", 90000.00, "1983-04-08"));

        employeeObj.managerControlPanel(employeesMap);
    }
}
