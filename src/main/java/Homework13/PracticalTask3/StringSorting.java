package Homework13.PracticalTask3;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Zoe", "Anna", "Mike", "Bob"));

        // Sort in descending order
        strings.sort((s1, s2) -> s1.compareTo(s2));

        for (String s : strings) {
            System.out.println(s);
        }
    }
}

