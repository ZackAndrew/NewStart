package Homework10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void printStudentsByCourse(ArrayList<Student> student, int course) {
        boolean found = false;
        for (Student s : student) {
            if (s.getCourse() == course) {
                found = true;
                System.out.println(s);
            }
        }
        if (!found)
            System.out.println("No students in this course");
    }

    public void sortByName(ArrayList<Student> students) {
        Comparator<Student> sortByNameComparator = (i, j) -> i.getName().compareTo(j.getName());

        Collections.sort(students, sortByNameComparator);
        for (Student s : students)
            System.out.println(s);
    }

    public void sortByCourse(ArrayList<Student> students) {
        Comparator<Student> sortByCourseComparator = (i, j) -> i.getCourse() > j.getCourse() ? 1 : -1;
        Collections.sort(students, sortByCourseComparator);
        for (Student s : students)
            System.out.println(s);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
