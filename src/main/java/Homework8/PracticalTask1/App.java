package Homework8.PracticalTask1;

public class App {
    public static void main(String[] args) {
        Department department = new Department("Andrii", "Wroclaw", "Barycka", 10);
        System.out.println(department);
        Department department1;
        try {
            department1 = (Department) department.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(department1);
        System.out.println("===========================");
        department1.getAddress().setBuilding(15);
        System.out.println(department1);
    }
}

