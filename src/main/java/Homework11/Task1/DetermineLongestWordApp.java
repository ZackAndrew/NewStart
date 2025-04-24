package Homework11.Task1;

public class DetermineLongestWordApp {
    public static void main(String[] args) {

        String text = "I really love coding Java ";

        String[] words = text.split(" ");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }

        System.out.println("Longest word is: " + longest);
        System.out.println("Its length is " + longest.length());

        String secondReversedWord = new StringBuilder(words[1]).reverse().toString();
        System.out.println("Second reversed word is " + secondReversedWord);
    }
}
