package Homework9.PracticalTask3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();

        // create new collection "myCollection"
        ArrayList<Integer> myCollection = new ArrayList<>();

        // create object of Collection class
        Collection collection = new Collection(myCollection);

        // add 10 random numbers to myCollection
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(100) - 50);
        }

        // output collection
        System.out.println("random 10 integers:");
        System.out.println(myCollection);

        // create new collection "newCollection"
        ArrayList<Integer> newCollection = new ArrayList<>();

        // find all integers greater than 5 and add it to newCollection
        newCollection = collection.findGreaterThanFiveElements(myCollection);

        // output newCollection
        System.out.println("Collection with elements which greater than 5: ");
        System.out.println(newCollection);

        // remove from myCollection elements which are greater than 20
        myCollection = collection.removeGreaterThanTwentyElements(myCollection);
        System.out.println("Collection without integers greater than 20:");
        System.out.println(myCollection);

        //Insert elements 1, -3, -4 in positions 2, 8, 5.
        if (myCollection.size() >= 6) {
            myCollection.add(2, 1);
            myCollection.add(5, -4);
            myCollection.add(8, -3);
        }

        // insert elements at positions
        collection.insertElementAtPosition(myCollection, 2, 1);
        collection.insertElementAtPosition(myCollection, 8, -3);
        collection.insertElementAtPosition(myCollection, 5, -4);

        //Output the result in the format: “position –xxx, value of element – xxx”
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position – " + i + ", value of element – " + myCollection.get(i));
        }

        // sort list
        Collections.sort(myCollection);

        // output sorted collection
        System.out.println("sorted collection:");
        System.out.println(myCollection);

    }

}
