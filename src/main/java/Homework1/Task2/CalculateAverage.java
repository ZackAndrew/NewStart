package Homework1.Task2;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sumOfNumbers = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Input " + (i+1) + " number: ");
            sumOfNumbers += scan.nextDouble();
        }
        double averageNum = sumOfNumbers / 3;
        System.out.println("Average number is: " + averageNum);
    }
}
