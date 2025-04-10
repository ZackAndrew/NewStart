package Homework9.PracticalTask2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SplitString {
    private String setOfNumbers;

    public SplitString() {

    }

    // split string of numbers by comma
    public ArrayList<Integer> splitStringOfNumbers(String setOfNumbers) {
        ArrayList<Integer> splitNumbers = new ArrayList<>();
        if(setOfNumbers == null || setOfNumbers.trim().isEmpty()){
            return splitNumbers;
        }
        String[] parts = setOfNumbers.split(",");
        for (String part : parts) {
            splitNumbers.add(Integer.parseInt(part.trim()));
        }
        return splitNumbers;
    }

    // remove duplicates from ArrayList
    public ArrayList<Integer> removeDuplicate(ArrayList<Integer> splitNumbers) {
        return new ArrayList<>(new LinkedHashSet<>(splitNumbers));
    }

    public String getSetOfNumbers() {
        return setOfNumbers;
    }

    public void setSetOfNumbers(String setOfNumbers) {
        this.setOfNumbers = setOfNumbers;
    }

}
