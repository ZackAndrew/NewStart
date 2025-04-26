package Homework13.Task2;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValidatorApp {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 12, 11);
        System.out.println(birthday);
        DateTimeFormatter europeFormat = DateTimeFormatter.ofPattern("MM.dd.yy");
        System.out.println(birthday.format(europeFormat));
    }
}
