package Homework12.PracticalTask1;

public class RectangleUtils {
    private int a;
    private int b;

    public RectangleUtils(int a, int b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Sides can't be negative");
        this.a = a;
        this.b = b;
    }

    public int squareRectangleArea() {
        return a * b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
