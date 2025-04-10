package Homework3.Task2;

import java.util.ArrayList;
import java.util.List;

public class FindSmallestNumber {
    private List<Integer> numbers = new ArrayList<>();

    public FindSmallestNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getSmallestNumber() {
        int s = numbers.get(0);
        for (int x : numbers) {
            if (x < s)
                s = x;
        }
        return s;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
