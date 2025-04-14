package Homework9.Task2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Dima", "ITS4", 2, 2, 2.5, 3));
        students.add(new Student("Alex", "ITS4", 3, 3.5, 4, 5));
        students.add(new Student("Andrii", "ITS4", 2, 3.5, 4, 5));
        // output students
        student.printStudents(students);

        // filter and promote students by average grade
        student.filterAndPromoteStudents(students);

        // output result
        System.out.println();
        System.out.println("Students after filter and promotion students by average grade:");
        student.printStudents(students);

    }
}
