package Homework4.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 float numbers belong to the range [-5, 5]: ");
        float[] numbers = new float[3];
        boolean belongRange = true;

        // loop to check if all numbers belong to the range [-5, 5]
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ": ");
            numbers[i] = scan.nextFloat();
            if (numbers[i] < -5 || numbers[i] > 5) {
                belongRange = false;
                break;
            }
        }
        if (!belongRange) {
            System.out.println("not all numbers belong to the range [-5, 5]");
        } else {
            System.out.println("all numbers belong to the range [-5, 5]");
        }
    }
}
