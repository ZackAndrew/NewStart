package Homework14.PracticalTask2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStatisticsProcessor {
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

//        calculate count, min, max, sum, for numbers and print all results
        IntSummaryStatistics stats = primes.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(stats.getMin());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getSum());
    }
}
