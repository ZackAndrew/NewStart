package Homework10.PracticalTask1;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // create HashMap
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // put 7 employees into HashMap
        employeeMap.put(1001, "Alice");
        employeeMap.put(1002, "Bob");
        employeeMap.put(1003, "Charlie");
        employeeMap.put(1004, "Diana");
        employeeMap.put(1005, "Ethan");
        employeeMap.put(1006, "Fiona");
        employeeMap.put(1007, "George");

        // output employees
        System.out.println(employeeMap);

        System.out.println("Enter employee ID: ");
        Scanner scan = new Scanner(System.in);
        int inputID = scan.nextInt();
        if (employeeMap.containsKey(inputID))
            System.out.println("Employee with " + inputID + " ID is: " + employeeMap.get(inputID));
        else
            System.out.println("Here is not employee with " + inputID + " ID");

        System.out.println("Enter employee name");
        String inputName = scan.nextLine();
        if (employeeMap.containsValue(inputName))
            System.out.println(inputName + " has "+employeeMap.get(inputName));
    }
}
