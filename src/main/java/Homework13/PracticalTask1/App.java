package Homework13.PracticalTask1;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today is "+date.getDayOfWeek());
    }
}
