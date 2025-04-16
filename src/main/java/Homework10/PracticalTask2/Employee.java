package Homework10.PracticalTask2;

import java.util.ArrayList;
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
            scan.nextLine();
            switch (choice) {
                case 1:
                    printEmployees(employeesHashMap);
                    break;
                case 2:
                    addEmployee(employeesHashMap);
                    break;
                case 3:
                    editEmployee(employeesHashMap);
                    break;
                case 4:
                    removeEmployee(employeesHashMap);
                    break;
                case 6:
                    return;
            }
        }
    }

    public void printEmployees(HashMap<Integer, Employee> employeeHashMap) {
        for (Map.Entry<Integer, Employee> entry : employeeHashMap.entrySet()) {
            System.out.println(entry.toString());
        }
    }

    public String addName(HashMap<Integer, Employee> employeeHashMap) {
        String inputName;
        while (true) {
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
        return inputName;
    }

    public void addEmployee(HashMap<Integer, Employee> employeeHashMap) {
        String inputName;
        int inputID;
        String inputPosition;
        double inputSalary;
        String inputBirthdate;

        inputName = addName(employeeHashMap);

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

    }

    public void editEmployee(HashMap<Integer, Employee> employeeHashMap) {
        printEmployees(employeeHashMap);
        System.out.println("Enter ID of employee who you want to edit: ");
        int inputEmployee = scan.nextInt();
        scan.nextLine();

        Employee emp = employeeHashMap.get(inputEmployee);
        if (emp != null) {
            while (true) {
                System.out.println("1. Change name\n2. Change position\n" +
                        "3. Change salary\n4. Change birthdate" +
                        "\n5. Stop editing\nChose action:");
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        String newName = addName(employeeHashMap);
                        emp.setName(newName);
                        System.out.println("Name has been updated.");
                        break;
                    case 2:
                        System.out.println("Enter new position:");
                        emp.setPosition(scan.nextLine());
                        System.out.println("Position has been updated.");
                        break;
                    case 3:
                        System.out.println("Enter new salary:");
                        emp.setSalary(scan.nextDouble());
                        scan.nextLine();
                        System.out.println("Salary has been updated.");
                        break;
                    case 4:
                        System.out.println("Enter new birthdate:");
                        emp.setBirthdate(scan.nextLine());
                        System.out.println("Birthdate has been updated.");
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice, try again");
                }
            }
        }
    }

    public void removeEmployee(HashMap<Integer, Employee> employeeHashMap) {
        printEmployees(employeeHashMap);
        while (true) {
            System.out.println("Chose employee ID who you want to delete, or enter 0 to cancel: ");
            int input = scan.nextInt();
            scan.nextLine();
            if (employeeHashMap.containsKey(input)) {
                System.out.println("Are you sure that you want to delete this employee?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1:
                        employeeHashMap.remove(input);
                        System.out.println("Employee has been deleted.");
                        return;
                    case 2:
                        System.out.println("Action canceled.");
                        return;
                    default:
                        System.out.println("Invalid input.");
                        return;
                }
            } else if (input == 0) {
                System.out.println("Action canceled.");
                return;
            } else
                System.out.println("Invalid input, try again");
        }
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
