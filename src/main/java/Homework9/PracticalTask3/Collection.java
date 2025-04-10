package Homework9.PracticalTask3;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    private ArrayList<Integer> myCollection = new ArrayList<>();

    public Collection(ArrayList<Integer> myCollection) {
        this.myCollection = myCollection;
    }

    public ArrayList<Integer> findGreaterThanFiveElements(ArrayList<Integer> myCollection) {
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i : myCollection) {
            if (i > 5) {
                newCollection.add(i);
            }
        }
        return newCollection;
    }

    public ArrayList<Integer> removeGreaterThanTwentyElements(ArrayList<Integer> myCollection) {
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        return myCollection;
    }

    public ArrayList<Integer> insertElementAtPosition(ArrayList<Integer> myCollection, int position, int element) {
        while (myCollection.size() <= position) {
            myCollection.add(null);
        }
        myCollection.set(position, element);
        return myCollection;
    }

    public ArrayList<Integer> getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(ArrayList<Integer> myCollection) {
        this.myCollection = myCollection;
    }
}
