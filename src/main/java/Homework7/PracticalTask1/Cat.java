package Homework7.PracticalTask1;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Eats fish");
    }

    public String getName() {
        return name;
    }
}
