package Homework5.Task2;

import java.util.Scanner;

public class CalculateSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            int n1, n2, sum;
            System.out.println("Enter number 1:");
            n1 = scan.nextInt();
            System.out.println("Enter number 2:");
            n2 = scan.nextInt();

            sum = n1 + n2;
            System.out.println("Sum: " + sum);

            System.out.println("Do you want to perform the operation again?\nYes? Enter '1'\nNo? Enter '2'\nEnter: ");
            choose = scan.nextInt();

        } while (choose == 1);
        System.out.println("Program terminated");
        scan.close();
    }
}

