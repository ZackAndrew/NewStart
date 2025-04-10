package Homework7.PracticalTask2;

public class Cleaner extends Staff{
    public final static String TYPE_PERSON = "Cleaner";
    public Cleaner(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println("I earn less");
    }

    @Override
    void print() {
        System.out.println("I'm a cleaner");
    }
}
