package Homework9.PracticalTask2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SplitString splitter = new SplitString();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers by comma: ");
        splitter.setSetOfNumbers(scan.nextLine());

        // Split string of integers by comma
        ArrayList<Integer> numbers = splitter.splitStringOfNumbers(splitter.getSetOfNumbers());

        // output split numbers
        System.out.println(numbers);

        // remove duplicates
        ArrayList<Integer> uniqueNumbers = splitter.removeDuplicate(numbers);

        // output numbers without duplicates
        System.out.println(numbers);


    }
}
