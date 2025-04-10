package Homework3.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(-3);
        array.add(567);
     FindSmallestNumber numbers = new FindSmallestNumber(array);
        System.out.println(numbers.getSmallestNumber());
    }
}
