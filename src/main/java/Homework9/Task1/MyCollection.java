package Homework9.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MyCollection {
    private ArrayList<Integer> myCollection;

    public MyCollection(ArrayList<Integer> myCollection) {
        this.myCollection = myCollection;
    }

    // method to swap min and max values in ArrayList
    public ArrayList<Integer> swapMinAndMaxValues(ArrayList<Integer> myCollection) {
        if (myCollection.isEmpty()) {
            return myCollection;
        }
        // find max and min values
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);

        // find indexes of min and max values
        int maxIndex = myCollection.indexOf(max);
        int minIndex = myCollection.indexOf(min);

        // swap min and max values
        Collections.swap(myCollection, maxIndex, minIndex);

        return myCollection;
    }


    public ArrayList<Integer> insertThreeRandomValuesBeforeFirstNegative(ArrayList<Integer> myCollection) {
        Random rand = new Random();
        int insertIndex = -1;
        // find index of first negative value
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                insertIndex = i;
                break;
            }
        }

        // if not negatives, index at the end
        if (insertIndex == -1) {
            insertIndex = myCollection.size();
        }

        // insert 3 random integers
        for (int i = 0; i < 3; i++) {
            myCollection.add(insertIndex + i, rand.nextInt(100) - 50);
        }
        return myCollection;
    }

    public ArrayList<Integer> insertZeroBetweenValuesWithDifferentSigns(ArrayList<Integer> myCollection) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            int current = myCollection.get(i);
            result.add(current);

            if (i + 1 < myCollection.size()) {
                int next = myCollection.get(i + 1);
                if ((current < 0 && next > 0) || (current > 0 && next < 0)) {
                    result.add(0);
                }
            }
        }
        return result;
    }

    public ArrayList<Integer> removeLastEvenElement(ArrayList<Integer> myCollection) {
        ArrayList<Integer> result = new ArrayList<>(myCollection);
        int indexOfLastEvenElement = -1;
        // find last even element
        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i) % 2 == 0) {
                indexOfLastEvenElement = i;
                break;
            }
        }
        if (indexOfLastEvenElement == -1) {
            System.out.println("There are not even numbers");
        } else {
            result.remove(indexOfLastEvenElement);
        }
        return result;
    }

    public ArrayList<Integer> removeTheElementFollowingTheFirstMinimum(ArrayList<Integer> myCollection) {
        ArrayList<Integer> result = new ArrayList<>(myCollection);
        int min = Collections.min(result);
        int indexOfFirstMin = result.indexOf(min);
        if (indexOfFirstMin + 1 < result.size()) {
            result.remove(indexOfFirstMin + 1);
        }
        return result;
    }

    public ArrayList<Integer> getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(ArrayList<Integer> myCollection) {
        this.myCollection = myCollection;
    }
}
