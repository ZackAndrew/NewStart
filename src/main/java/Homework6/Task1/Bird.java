package Homework6.Task1;

public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " feathers " + feathers + " lay eggs " + layEggs;
    }
    public void print(){
        System.out.println(this);
    }

}
