package Homework5.Task1;

public class App {
    public static void main(String[] args) {
        MonthDaysCalculator month = new MonthDaysCalculator(3);
        System.out.println("Days in " + month.getMonthNumber() + " month " + month.getDaysInMonth(month.getMonthNumber()));
        int[] array = {4, 6, 1, 7, 2, 1, 4, -3, 101, 2};
        ArraySumOrProduct numbers = new ArraySumOrProduct(array);

        System.out.println(numbers.getSumOrProduct(numbers.getArray()));

        int[] fiveNumbers = {3, -21, -4,-1,0};
        ArrayAnalysis fiveNumbersArray = new ArrayAnalysis(fiveNumbers);
        System.out.println(fiveNumbersArray.getIndexOfSecondPositive());
        System.out.println(fiveNumbersArray.getMinValuePosition());
        System.out.println(fiveNumbersArray.getMinValue());
    }
}
