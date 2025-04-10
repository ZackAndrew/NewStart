package Homework6.Task1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Eagle(true, true));
        birds.add(new Swallow(true, true));
        birds.add(new Penguin(false, true));
        birds.add(new Kiwi(false, true));

        for (Bird bird : birds){
            bird.print();
            bird.fly();
        }
    }
}
