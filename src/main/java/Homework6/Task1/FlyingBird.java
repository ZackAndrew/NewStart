package Homework6.Task1;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Fly");
    }
}
