package Homework15.PracticalTask1;

public class App {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();
    }
}
