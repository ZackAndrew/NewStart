package Homework5.PracticalTask4;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public void employeesOfCertainDepartment(Employee[] employees, int departmentNumber) {
        Employee[] employeesOfCertainDepartment = null;
        System.out.println("Employees in "+departmentNumber+" department: ");
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }
    }

    public Employee[] sortEmployeesBySalary(Employee[] employees){
        for (int i = 0; i<employees.length; i++){
            for (int j = i+1; j<employees.length; j++){
                if(employees[i].salary< employees[j].salary){
                    Employee tmp = employees[i];
                    employees[i]= employees[j];
                    employees[j]=tmp;
                }
            }
        }
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
