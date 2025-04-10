package Homework2.Task3;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        for(int i =0; i< people.length; i++){
            people[i] = new Person();
            people[i].input();
        }
        System.out.println(people[0].output());
        System.out.println("Change last name: ");

        System.out.println(people[0].output());
    }
}
