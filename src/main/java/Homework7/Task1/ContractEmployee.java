package Homework7.Task1;

public class ContractEmployee extends Employee {
    private double hourWage;
    private double workingHours;
    private String federalTaxIdNumber;

    public ContractEmployee(String employeeId, double hourWage, double workingHours, String federalTaxIdNumber) {
        super(employeeId);
        this.hourWage = hourWage;
        this.workingHours = workingHours;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    @Override
    public double calculatePay() {
        return hourWage * workingHours;
    }

    @Override
    void print() {
        System.out.println(this.getClass().getSimpleName() + " Federal TaxID number: " + federalTaxIdNumber + " monthly salary: " + calculatePay());
    }
}
