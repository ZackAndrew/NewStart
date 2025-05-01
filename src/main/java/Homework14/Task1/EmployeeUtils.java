package Homework14.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeUtils extends Employee {

    private HashMap<Integer, Employee> employeeHashMap;

    public EmployeeUtils(int age, String name, HashMap<Integer, Employee> employeeHashMap) {
        super(name, age);
        this.employeeHashMap = employeeHashMap;
    }


    public HashMap<Integer, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    public String mostPopularName() {
        return employeeHashMap.values().stream()
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public void setEmployeeHashMap(HashMap<Integer, Employee> employeeHashMap) {
        this.employeeHashMap = employeeHashMap;
    }
}
