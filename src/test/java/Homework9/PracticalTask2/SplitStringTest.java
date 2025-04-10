package Homework9.PracticalTask2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringTest {
    @Test
    public void testSplitStringOfNumbers() {
        var obj = new SplitString();
        // case 1: normal test
        String input = "1,2,3,4,5";
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> actual = obj.splitStringOfNumbers(input);
        assertEquals(expected, actual);

        // case 2: empty line
        input = "";
        expected = new ArrayList<>();
        actual = obj.splitStringOfNumbers(input);
        assertEquals(expected, actual);

        // case 3: line with spaces
        input = " 1,  2,     3, 4 ,5 ";
        expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        actual = obj.splitStringOfNumbers(input);
        assertEquals(expected, actual);

        // case 4: incorrect input
        assertThrows(NumberFormatException.class, () -> {
            obj.splitStringOfNumbers("1,two,3,4");
        });
    }
}