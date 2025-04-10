package Homework2.Task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter first number: ");
        num1 = Integer.parseInt(scan.next());
        System.out.println("Enter second number: ");
        num2 = Integer.parseInt(scan.next());
        GetAverage averageNum = new GetAverage();
        GetSum sum = new GetSum();

        System.out.println(averageNum.getAverage(num1, num2));
        System.out.println(sum.getSum(num1, num2));
    }
}
