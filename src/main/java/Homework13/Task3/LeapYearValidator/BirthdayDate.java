package Homework13.Task3.LeapYearValidator;

import java.time.LocalDate;

public class BirthdayDate {

    static void birthdayDay(LocalDate birthday) {
        System.out.println("Day of birthday: " + birthday.getDayOfWeek());
        LocalDate afterSixMonths = birthday.plusMonths(6);
        System.out.println("Day after 6 month: " + afterSixMonths.getDayOfWeek());
        LocalDate afterTwelveMonths = birthday.plusYears(1);
        System.out.println("Day after 12 months: " + afterTwelveMonths.getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 12, 11);
        birthdayDay(birthday);

    }
}
