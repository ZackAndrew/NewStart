package Homework9.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student {
    private String name;
    private String group;
    private int course;
    private double mathGrade;
    private double ITGrade;
    private double PEGrade;

    public Student() {
    }

    public Student(String name, String group, int course, double mathGrade, double ITGrade, double PEGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.ITGrade = ITGrade;
        this.PEGrade = PEGrade;
    }

    public double getAverageGrade() {
        return (mathGrade + ITGrade + PEGrade) / 3;
    }

    public ArrayList<Student> filterAndPromoteStudents(ArrayList<Student> students) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getAverageGrade()>=3) {
               s.setCourse(s.getCourse()+1);
            } else {
                it.remove();
            }
        }
        return students;
    }

    public void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s.getName() + " course: " + s.getCourse());

        }
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getITGrade() {
        return ITGrade;
    }

    public void setITGrade(double ITGrade) {
        this.ITGrade = ITGrade;
    }

    public double getPEGrade() {
        return PEGrade;
    }

    public void setPEGrade(double PEGrade) {
        this.PEGrade = PEGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", mathGrade=" + mathGrade +
                ", ITGrade=" + ITGrade +
                ", PEGrade=" + PEGrade +
                '}';
    }
}
