package Homework5.PracticalTask3;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayAnalyzer {
    private int[] randomArray;
    private int numberOfPositiveValues;
    private int numberOfNegativeValues;

    public RandomArrayAnalyzer(int[] randomArray) {
        this.randomArray = randomArray;
    }

    public RandomArrayAnalyzer() {
    }

    public void setRandomNumbers(int numberOfNumbers) {
        Random rand = new Random();
        numberOfPositiveValues = 0;
        numberOfNegativeValues = 0;
        int[] randomNumbers = new int[numberOfNumbers];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(2001) - 1000;
            if (randomNumbers[i] > 0) {
                numberOfPositiveValues++;
            } else {
                numberOfNegativeValues++;
            }

        }
        setRandomArray(randomNumbers);
    }

    public int getBiggestNum(int[] numbers) {
        int biggestNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (biggestNum < numbers[i]) {
                biggestNum = numbers[i];
            }
        }
        return biggestNum;
    }

    public int sumOfPositiveNumbers(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int[] getRandomArray() {
        return randomArray;
    }

    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }

    public int getNumberOfPositiveValues() {
        return numberOfPositiveValues;
    }

    public int getNumberOfNegativeValues() {
        return numberOfNegativeValues;
    }

    @Override
    public String toString() {
        return "RandomArrayAnalyzer{" +
                "randomArray=" + Arrays.toString(randomArray) +
                '}';
    }
}
