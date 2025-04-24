package Homework12.Task2;

import java.util.Scanner;

public class NumberReader {
    Scanner scan = new Scanner(System.in);

    public int readNumber(int start, int end) throws NotInRangeException {
        String input = scan.nextLine();
        try {
            int number = Integer.parseInt(input);
            if (number < start || number > end) {
                throw new NotInRangeException("This int not in range");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("It is not an integer");
        }
    }
}
