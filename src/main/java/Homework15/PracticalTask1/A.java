package Homework15.PracticalTask1;

public class A implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++, Thread.sleep(1000)) {
                System.out.println("I study Java");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

