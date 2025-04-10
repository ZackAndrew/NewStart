package Homework4.PracticalTask1;

public class IsNumberOdd {
    private int totalOddNumbers = 0;
    private int[] numbers = new int[3];

    public IsNumberOdd(int[] numbers) {
        this.numbers = numbers;
    }

    public int countOddNumbers() {
        for (int x : numbers) {
            if (x % 2 != 0)
                totalOddNumbers++;
        }
        return totalOddNumbers;
    }

    public int getTotalOddNumbers() {
        return totalOddNumbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
