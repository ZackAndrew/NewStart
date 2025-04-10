package Homework4.Task2;

public class MaxMinFinder {
    int[] numbers = new int[3];

    public MaxMinFinder(int[] numbers) {
        this.numbers = numbers;
    }

    //method to find max number in array
    public int getMax(int[] numbers) {
        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    //method to find min number in array
    public int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
