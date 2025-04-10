package Homework2.Task2;

public class Employee {
    private static double totalSum;
    private double rate;
    private int hours;
    private String name;

    public Employee() {
    }

    public Employee(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Employee(double rate, int hours, String name) {
        this.rate = rate;
        this.hours = hours;
        this.name = name;
        totalSum += (getSalary() + getBonuses());
    }

    public double getSalary() {
        return getHours() * getRate();
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rate=" + rate +
                ", hours=" + hours +
                ", name='" + name + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
