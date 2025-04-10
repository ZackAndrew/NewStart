package Homework7.PracticalTask2;

public class Teacher extends Staff{
    public static final String TYPE_PERSON = "Teacher";
    public Teacher(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println("I earn much");
    }

    @Override
    void print() {
        System.out.println("I am a teacher");
    }
}
