package Homework5.PracticalTask1;

import java.util.Arrays;

public class ArrayCalculator {
    private int[] array;

    public ArrayCalculator(int[] array) {
        this.array = array;
    }

    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        setArray(array);
    }

    public double getAverage() {
        int sum = 0;
        for (int i : array)
            sum += i;
        return (double) sum / array.length;
    }

    public boolean containsValue(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayCalculator{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
