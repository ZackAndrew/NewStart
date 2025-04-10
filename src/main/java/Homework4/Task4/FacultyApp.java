package Homework4.Task4;

import java.util.Scanner;

public class FacultyApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter season (e.g. Winter, Summer...): ");
        String inputCurrentSeason = scan.nextLine().trim().toUpperCase();
        Season currentSeason = Season.valueOf(inputCurrentSeason);
        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println(faculty.displayInfo());
    }
}
