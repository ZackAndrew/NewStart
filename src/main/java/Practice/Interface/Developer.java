package Practice.Interface;

public class Developer {
    private int age;
    private String name;

    public Developer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void work(Computer computer) {
        computer.code();
    }
}
