package Homework3.Task1;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSemiPerimeter() {
        return getPerimeter() / 2;
    }

    public double getArea() {
        return Math.sqrt(getSemiPerimeter() * (getSemiPerimeter() - side1) * (getSemiPerimeter() - side2) * (getSemiPerimeter() - side3));
    }
}
