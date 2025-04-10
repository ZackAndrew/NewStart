package Homework4.PracticalTask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbersArray = {-6, 3, 5};
        IsNumberOdd numbers = new IsNumberOdd(numbersArray);
        System.out.println(numbers.countOddNumbers());

    }
}
