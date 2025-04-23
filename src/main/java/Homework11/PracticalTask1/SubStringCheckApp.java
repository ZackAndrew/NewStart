package Homework11.PracticalTask1;

public class SubStringCheckApp {
    public static void main(String[] args) {
        String text = "SoftServe  ";

        String text2 = "Softserve Academy";

        System.out.println(text2.trim().toUpperCase().contains(text.trim().toUpperCase()));
    }
}