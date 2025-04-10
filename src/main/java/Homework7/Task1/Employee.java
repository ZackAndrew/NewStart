package Homework7.Task1;

public abstract class Employee implements Payment {
    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    abstract void print();
}
