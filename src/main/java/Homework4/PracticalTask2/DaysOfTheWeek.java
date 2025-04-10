package Homework4.PracticalTask2;

import java.util.Scanner;

public class DaysOfTheWeek {
    private int dayOfTheWeek;


    public DaysOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayOfTheWeekByNumber() {
        switch (dayOfTheWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Impossible answer";
        }
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
