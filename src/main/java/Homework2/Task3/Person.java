package Homework2.Task3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    Scanner scan = new Scanner(System.in);

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void input() {
        System.out.println("Input first name: ");
        this.firstName = scan.next();
        System.out.println("Input second name: ");
        this.lastName = scan.next();
        System.out.println("Input birth year: ");
        this.birthYear = scan.nextInt();
    }

    public String output() {
        return "Name: " + firstName + ' ' + lastName + " age: " + getAge() + " birthday year: " + getBirthYear();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String fn, String ln) {
        this.lastName = ln;
        this.firstName = fn;
    }
}
