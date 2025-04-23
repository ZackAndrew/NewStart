package Homework10.Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static Homework10.Task1.SetOperations.intersect;
import static Homework10.Task1.SetOperations.union;

class SetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}

public class MapApp {
    public static void main(String[] args) {
        // Приклади множин
        Set<String> setA = new HashSet<>(Arrays.asList("яблуко", "банан", "вишня"));
        Set<String> setB = new HashSet<>(Arrays.asList("банан", "груша", "вишня"));

        // Тестування методів
        Set<String> unionResult = union(setA, setB);
        Set<String> intersectResult = intersect(setA, setB);

        System.out.println("Множина A: " + setA);
        System.out.println("Множина B: " + setB);
        System.out.println("Об'єднання: " + unionResult);
        System.out.println("Перетин: " + intersectResult);
    }

}
