package Homework5.Task4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        boolean guessNumber = false;
        while (!guessNumber) {
            System.out.println("Try to guess random number: ");
            int n = scan.nextInt();
            if (n == randomNumber) {
                guessNumber = true;
                System.out.println("Right!");
            } else if (n > randomNumber) {
                System.out.println("your number is too high, try again.");
            } else {
                System.out.println("your number is too low, try again");
            }
        }
    }
}
