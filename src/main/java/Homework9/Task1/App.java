package Homework9.Task1;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        // create myCollection ArrayList
        ArrayList<Integer> myCollection = new ArrayList<>();

        // add 10 random numbers to myCollection
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(100) - 50);
        }

        // output myCollection
        System.out.println(myCollection);

        // create object of MyCollection class
        MyCollection collectionObj = new MyCollection(myCollection);

        // swap min and max values in myCollection
        collectionObj.swapMinAndMaxValues(myCollection);

        // output result
        System.out.println();
        System.out.println("Array after swapping min and max values");
        System.out.println(myCollection);

        // insert 3 random integers before first negative value
        collectionObj.insertThreeRandomValuesBeforeFirstNegative(myCollection);

        // output result
        System.out.println();
        System.out.println("Array after inserting 3 integers values before first negative value:");
        System.out.println(myCollection);

        // insert 0 between values with opposite signs
        myCollection = collectionObj.insertZeroBetweenValuesWithDifferentSigns(myCollection);

        // output result
        System.out.println();
        System.out.println("Array after inserting 0 between values with opposite signs:");
        System.out.println(myCollection);

        // remove last even element
        myCollection = collectionObj.removeLastEvenElement(myCollection);

        // output result
        System.out.println();
        System.out.println("Array after removing last even element:");
        System.out.println(myCollection);

        // Remove from the list myCollection the element following the first minimum
        myCollection = collectionObj.removeTheElementFollowingTheFirstMinimum(myCollection);
        System.out.println();
        System.out.println("Array after removing from the list myCollection the element following the first minimum:");
        System.out.println(myCollection);

    }
}
