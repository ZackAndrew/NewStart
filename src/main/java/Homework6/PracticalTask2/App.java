package Homework6.PracticalTask2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Line> lines = new ArrayList<>();
        lines.add(new Line(new Point(2, 3), new Point(5, 6)));
        lines.add(new ColorLine(new Point(10, 11), new Point(15, 16), "Yellow"));
        lines.add(new ColorLine(new Point(1, 2), new Point(13, 14), "Red"));

        for (Line line: lines){
            line.print();
        }
    }
}
