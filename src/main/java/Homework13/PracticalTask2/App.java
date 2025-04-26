package Homework13.PracticalTask2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class App {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDay = today.withDayOfMonth(1);
        LocalDate firstMonday = firstDay.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        DateTimeFormatter europeFormat = DateTimeFormatter.ofPattern("d.MM.yy");
        System.out.println(firstMonday.format(europeFormat));
    }
}
