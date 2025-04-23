package Homework10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student();

        // Add 5 students
        students.add(new Student("Ivan Petrenko", 1));
        students.add(new Student("Olena Shevchenko", 2));
        students.add(new Student("Serhii Anriev", 2));
        students.add(new Student("Andrii Koval", 1));
        students.add(new Student("Maria Ivanenko", 3));
        students.add(new Student("Serhii Bondar", 2));

        student.printStudentsByCourse(students, 1);

        System.out.println("===================================");

        student.sortByName(students);

        System.out.println("==================================");

        student.sortByCourse(students);

    }
}
