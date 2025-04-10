package Homework7.PracticalTask1;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void feed() {
        System.out.println("Eats meat");
    }

    public String getName() {
        return name;
    }
}
