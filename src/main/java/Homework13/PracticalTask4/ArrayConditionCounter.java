package Homework13.PracticalTask4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayConditionCounter {
    private ArrayList<Integer> integers;


    public ArrayConditionCounter(ArrayList<Integer> integers) {
        this.integers = integers;
    }

    public int count(Predicate<Integer> predicate) {
        int count = 0;
        for (Integer i : integers) {
            if (predicate.test(i)) {
                count++;
            }
        }
        return count;
    }

    public void print() {
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public ArrayList<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(ArrayList<Integer> integers) {
        this.integers = integers;
    }
}
