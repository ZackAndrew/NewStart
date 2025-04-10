package Homework3.PracticalTask1;

import java.util.Scanner;

public class Calc {
    private static String prompt;
    private int num1;
    private int num2;

    public Calc() {
    }

    public double getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public double getAverage(int num1, int num2) {
        return getTotal(num1, num2) / 2.0;
    }

    public static int getNumber(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}
