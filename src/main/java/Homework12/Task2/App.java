package Homework12.Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberReader reader = new NumberReader();
        Integer[] numbers = new Integer[10];

        System.out.println("Enter 10 numbers in range 1-100");

        for (int i = 0; i < 10; i++) {
            while(true){
                System.out.printf("Введіть число #%d: ", i + 1);

                try {
                    int number = reader.readNumber(1, 100);
                    numbers[i]= number;
                    break;
                } catch (NotInRangeException | NumberFormatException e) {
                    System.out.println("Error"+e.getMessage());
                }
            }
        }
        for (Integer i: numbers){
            System.out.println(i);
        }
    }
}
