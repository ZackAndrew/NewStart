package Homework9.PracticalTask1;

public class HeavyBox {
    private int weight;
    private String contents;

    // constructor
    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    // print information about box
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Weight: " + weight + " contents: " + contents;
    }


    public int getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
