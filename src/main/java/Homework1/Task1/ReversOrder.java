package Homework1.Task1;

import java.util.Scanner;

public class ReversOrder {
    public static void main(String[] args) {
        System.out.println("Enter 3 words: ");
        String[] words = new String[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.next();
        }
        for (int i = words.length; i > 0; i--) {
            System.out.println(words[i-1]);
        }
    }
}
