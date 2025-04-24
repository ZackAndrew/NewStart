package Homework12.PracticalTask2;

import Homework12.PracticalTask2.Exceptions.ColorException;
import Homework12.PracticalTask2.Exceptions.SizeException;
import Homework12.PracticalTask2.Exceptions.TypeException;

public class App {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant(10, "green", "flower");
            plants[1] = new Plant(15, "red", "tree");
            plants[2] = new Plant(7, "yellow", "bush");
            plants[3] = new Plant(4, "blue", "herb");
            plants[4] = new Plant(9, "purple", "vine");
        } catch (ColorException | TypeException | SizeException e) {
            System.out.println(e.getMessage());
        }
        for (Plant p : plants) {
            if (p != null)
                System.out.println(p.toString());
        }
    }
}
