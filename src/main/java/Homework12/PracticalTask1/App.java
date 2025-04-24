package Homework12.PracticalTask1;

public class App {
    public static void main(String[] args) {

        try {
            RectangleUtils rectangle = new RectangleUtils(-1, 2);
            System.out.println(rectangle.squareRectangleArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}