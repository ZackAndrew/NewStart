package Homework6.PracticalTask2;

public class Line {
    protected Point start, finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Line from " + start + " to" + finish;
    }

    public void print() {
        System.out.println(this);
    }
}
