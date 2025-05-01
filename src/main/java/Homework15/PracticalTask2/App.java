package Homework15.PracticalTask2;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++, Thread.sleep(2000))
                    System.out.println("Hello World " + LocalTime.now());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++, Thread.sleep(3000)) {
                    System.out.println("Peace in the peace " + LocalTime.now());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
            t1.start();
            t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("My name is …");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
