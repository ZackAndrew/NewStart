package Homework7.PracticalTask2;

public abstract class Person {
    public static final String TYPE_PERSON = "Person";
    protected String name;

    public Person(String name) {
    }
    abstract void print();
}
