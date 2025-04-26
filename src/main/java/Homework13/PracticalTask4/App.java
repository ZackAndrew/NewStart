package Homework13.PracticalTask4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(7, 9, 9, 6, 8, 7, 4, 9, 10));
        ArrayConditionCounter case1 = new ArrayConditionCounter(integers);
        case1.print();
        int countGoodOrBetterHotels = case1.count(i -> i >= 8);
        int countEvens = case1.count(i -> i % 2 == 0);

        System.out.println(countGoodOrBetterHotels);
        System.out.println(countEvens);
    }
}
