package Homework7.PracticalTask2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Alice"));
        people.add(new Cleaner("Robert"));
        people.add(new Teacher("Drake"));

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
