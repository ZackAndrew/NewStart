package Homework10.PracticalTask2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    Scanner scan = new Scanner(System.in);

    // initialise variables
    private int id;
    private String name;
    private String position;
    private double salary;
    private String birthdate;

    // default constructor
    public Employee() {
    }

    // parameterised constructor
    public Employee(int id, String name, String position, double salary, String birthdate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.birthdate = birthdate;
    }

    public void managerControlPanel(HashMap<Integer, Employee> employeesHashMap) {
        System.out.println("Manager control panel: ");
        int choice;
        while (true) {
            System.out.println("1. Show employees list\n2. Add employee\n3. Edit employee" +
                    "\n4. Remove employee\n5. Sort employees\n6. Close control panel\n\nChoose action:\n");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    for (Map.Entry<Integer, Employee> entry : employeesHashMap.entrySet()) {
                        System.out.println(entry.toString());
                    }
                    break;
                case 2:
                    addEmployee(employeesHashMap);
                    break;
            }
        }
    }

    public HashMap<Integer, Employee> addEmployee(HashMap<Integer, Employee> employeeHashMap) {
        String inputName;
        int inputID;
        String inputPosition;
        double inputSalary;
        String inputBirthdate;

        while (true) {
            scan.nextLine();
            System.out.println("Enter employee name: ");
            inputName = scan.nextLine().trim();
            boolean duplicatedFound = false;
            for (Map.Entry<Integer, Employee> entry : employeeHashMap.entrySet()) {
                if (entry.getValue().name.equalsIgnoreCase(inputName)) {
                    System.out.println("This name already exists");
                    duplicatedFound = true;
                    break;
                }
            }
            if (!duplicatedFound) {
                break;
            }
        }

        while (true) {
            boolean duplicateFound = false;
            System.out.println("Enter ID: ");
            inputID = scan.nextInt();
            scan.nextLine();
            if (employeeHashMap.containsKey(inputID))
                System.out.println("This ID already exist");
            else
                break;
        }
        System.out.println("Input position:");
        inputPosition = scan.nextLine().trim();

        System.out.println("Input salary:");
        inputSalary = scan.nextDouble();
        scan.nextLine();

        System.out.println("Input birthdate");
        inputBirthdate = scan.nextLine().trim();

        employeeHashMap.put(inputID, new Employee(inputID, inputName, inputPosition, inputSalary, inputBirthdate));
        System.out.println("Employee added successfully");
        return employeeHashMap;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Position: %s, Salary: %.2f, DOB: %s",
                id, name, position, salary, birthdate);
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
