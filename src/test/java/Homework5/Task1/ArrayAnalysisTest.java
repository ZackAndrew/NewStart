package Homework5.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAnalysisTest {

    @Test
    public void testGetIndexOfSecondPositive() {
        // Test case 1: regular case
        var obj = new ArrayAnalysis(new int[]{-2, 3, -4, 5, -6, 7});
        assertEquals(3, obj.getIndexOfSecondPositive());

        // Test case 2: no positive numbers
        obj.setNumbers(new int[]{-3, -2, -5, -10});
        assertEquals(-1, obj.getIndexOfSecondPositive());

        // Test case 3: only one positive number
        obj.setNumbers(new int[]{-3, -4, 3, -5, -10});
        assertEquals(-1, obj.getIndexOfSecondPositive());

        // Test case 4: second positive number at the beginning
        obj.setNumbers(new int[]{10, 20, -20, -3, -40});
        assertEquals(1, obj.getIndexOfSecondPositive());

        // Test case 5: second positive number at the end
        obj.setNumbers(new int[]{-33, -44, -55, -66, 77, 8});
        assertEquals(5, obj.getIndexOfSecondPositive());
    }

    @Test
    public void testGetMinValue() {

        // Test case 1: regular case
        var obj = new ArrayAnalysis(new int[]{10, 3, 4, 55, 1, 3});
        assertEquals(1, obj.getMinValue());

        // Test case 2: negative numbers
        obj.setNumbers(new int[]{-1, -10, -5, -55, -3});
        assertEquals(-55, obj.getMinValue());

        // Test case 3: min number is negative
        obj.setNumbers(new int[]{3, 5, -3, 4, 7});
        assertEquals(-3, obj.getMinValue());

        // Test case 4: all numbers are same
        obj.setNumbers(new int[]{6, 6, 6, 6, 6});
        assertEquals(6, obj.getMinValue());

        // Test case 5: min number is first
        obj.setNumbers(new int[]{2, 4, 10, 5, 11});
        assertEquals(2, obj.getMinValue());

        // Test case 6: min number is last
        obj.setNumbers(new int[]{2, 4, 10, 5, 1});
        assertEquals(1, obj.getMinValue());
    }

}