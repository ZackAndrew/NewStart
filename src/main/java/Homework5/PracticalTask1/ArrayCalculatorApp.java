package Homework5.PracticalTask1;

import java.util.Scanner;

public class ArrayCalculatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -5, 942, 1, 0};
        ArrayCalculator array = new ArrayCalculator(numbers);
        System.out.println(array);
        array.sortArray();
        System.out.println(array);
        System.out.println(array.getAverage());
        System.out.println("Enter number: ");
        if (array.containsValue(scan.nextInt())) {
            System.out.println("This array contains your value");
        } else {
            System.out.println("This array doesn't contain your value");
        }
    }
}
