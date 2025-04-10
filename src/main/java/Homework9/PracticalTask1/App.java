package Homework9.PracticalTask1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(35, "Computer"));
        heavyBoxes.add(new HeavyBox(10, "Monitor"));
        heavyBoxes.add(new HeavyBox(4, "Accessories"));

        // output information about all HeavyBoxes
        for (HeavyBox b : heavyBoxes) {
            b.print();
        }

        // Change the weight of the first box by 1.
        HeavyBox firstBox = heavyBoxes.getFirst();
        firstBox.setWeight(firstBox.getWeight() + 1);

        // remove last box
        heavyBoxes.remove(heavyBoxes.getLast());

        // output result
        System.out.println("===========================");
        System.out.println("Boxes after changes: ");
        for (HeavyBox b : heavyBoxes) {
            b.print();
        }

        // remove all the boxes
        heavyBoxes.clear();

        // check are boxes deleted
        if (heavyBoxes.isEmpty()) {
            System.out.println("Array is empty");
        } else {
            for (HeavyBox b : heavyBoxes) {
                b.print();
            }
        }
    }
}
