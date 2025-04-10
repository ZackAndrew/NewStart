package Homework7.PracticalTask2;

public abstract class Staff extends Person{
    public static final String TYPE_PERSON = "Staff";
    public Staff(String name) {
        super(name);
    }
    abstract void salary();
}
