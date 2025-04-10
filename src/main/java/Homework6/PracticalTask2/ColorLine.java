package Homework6.PracticalTask2;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point finish, String color) {
        super(start, finish);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine from " + start + " to " + finish + " with color " + color;
    }
    public void print(){
        System.out.println(this);
    }
}
