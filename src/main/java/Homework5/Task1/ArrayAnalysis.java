package Homework5.Task1;

public class ArrayAnalysis {
    private int[] numbers;

    public ArrayAnalysis(int[] numbers) {
        this.numbers = numbers;
    }

    public int getIndexOfSecondPositive() {
        int countPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPositive++;
            }
            if (countPositive == 2) {
                return i;
            }
        }
        return -1;
    }

    public int getMinValuePosition() {
        int minValue = numbers[0];
        int minValuePosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minValuePosition = i;
            }
        }
        return minValuePosition;
    }

    public int getMinValue() {
        return numbers[getMinValuePosition()];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
