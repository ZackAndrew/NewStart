package Homework9.Task2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Dima", "ITS4", 2, 2, 2.5, 3));
        students.add(new Student("Alex", "ITS4", 2, 3.5, 4, 5));
        students.add(new Student("Andrii", "ITS4", 2, 3.5, 4, 5));
        System.out.println(students);

        student.filterAndPromoteStudents(students);
        System.out.println(students);
    }
}
