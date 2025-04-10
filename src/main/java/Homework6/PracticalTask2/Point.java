package Homework6.PracticalTask2;

public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + " ," + y + ")";
    }

    public void print() {
        System.out.println(this);
    }
}
