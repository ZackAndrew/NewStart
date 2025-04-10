package Homework8.Task1;

public abstract class Person {
    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    protected String info() {
        return "First name: " + fullName.getFirstName() + "Last name: "
                + fullName.getLastName() + "Age:" + age;
    }
    public abstract String activity();
    public abstract Person clone();
}
