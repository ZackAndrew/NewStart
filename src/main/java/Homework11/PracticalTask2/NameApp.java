package Homework11.PracticalTask2;

public class NameApp {
    public static void main(String[] args) {

        String firstName = "Andrii";
        String middleName = "Ruslanovych";
        String lastName = "Zakordonskyi";


        String initials = firstName.toUpperCase().charAt(0) + "." + middleName.toUpperCase().charAt(0) + ".";

        System.out.println(lastName + " " + initials);

        System.out.println(firstName);

        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}
