package Homework7.Task1;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double salary;

    public SalariedEmployee(String employeeId, double salary, String socialSecurityNumber) {
        super(employeeId);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    void print() {
        System.out.println(this.getClass().getSimpleName() + " Social Security number: " + socialSecurityNumber + " monthly salary: " + calculatePay());
    }
}
