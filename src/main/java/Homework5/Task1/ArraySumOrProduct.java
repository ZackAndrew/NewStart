package Homework5.Task1;

public class ArraySumOrProduct {
    private int[] array;

    public ArraySumOrProduct(int[] array) {
        this.array = array;
    }

    public int getSumOrProduct(int[] numbers) {
        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                allPositive = false;
                break;
            }
        }
        if (allPositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            return sum;
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            return product;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
