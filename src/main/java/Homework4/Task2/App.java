package Homework4.Task2;

public class App {
    public static void main(String[] args) {
        int[] numbers = {3, -5, 10};
        MaxMinFinder num = new MaxMinFinder(numbers);
        System.out.println(num.getMax(numbers));
        System.out.println(num.getMin(numbers));
    }
}
