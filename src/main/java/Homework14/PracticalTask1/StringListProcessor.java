package Homework14.PracticalTask1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListProcessor {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        long countEmpty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println(countEmpty + " empty strings");


        System.out.println("List without empty string");
        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

        String result = list.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }
}
