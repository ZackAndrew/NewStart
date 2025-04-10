package Homework5.Task1;

public class MonthDaysCalculator {
    private final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int month;

    public MonthDaysCalculator(int monthNumber) {
        this.month = monthNumber;
    }

    public int getDaysInMonth(int monthNumber) {
        return daysInMonth[monthNumber - 1];
    }

    public int getMonthNumber() {
        return month;
    }

    public void setMonthNumber(int monthNumber) {
        this.month = monthNumber;
    }

    public int[] getDaysInMonth() {
        return daysInMonth;
    }
}
