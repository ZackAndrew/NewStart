package Homework13.Task3.LeapYearValidator;

import java.time.LocalDate;

public class LeapYearValidator {

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int leapYear = LocalDate.of(2024, 2, 2).getYear();
        int notLeapYear = LocalDate.of(1900, 2, 2).getYear();
        int currentYear = LocalDate.now().getYear();
        int TwoThousandYear = LocalDate.of(2000, 2, 2).getYear();

        System.out.println(isLeap(leapYear));
        System.out.println(isLeap(notLeapYear));
        System.out.println(isLeap(currentYear));
        System.out.println(isLeap(TwoThousandYear));
    }
}
