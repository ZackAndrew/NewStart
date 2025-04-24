package Homework11.Task2;

public class SpaceNormalizerApp {
    public static void main(String[] args) {
        String text = "I am      learning         Java  Fundamental";

        String normalText = text.replaceAll(" +", " ");

        System.out.println(normalText);
    }
}
