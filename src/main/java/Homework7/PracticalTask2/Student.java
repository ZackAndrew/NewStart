package Homework7.PracticalTask2;

public class Student extends Person{
    public static final String TYPE_PERSON = "Student";
    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I'm student");
    }
}
