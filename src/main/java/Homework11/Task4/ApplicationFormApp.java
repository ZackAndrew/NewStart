package Homework11.Task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplicationFormApp {
    Scanner scan = new Scanner(System.in);
    private String firstName;
    private String lastName;

    public ApplicationFormApp() {
    }

    public void inputInformation() {
        String nameRegex = "^[A-Za-z\\-]+$";
        Pattern pattern = Pattern.compile(nameRegex);
        System.out.println("Input your first name");
        while (true) {
            firstName = scan.nextLine();
            Matcher matcher = pattern.matcher(firstName);
            if (matcher.find()) {
                System.out.println("Great!");
                break;
            } else
                System.out.println("Name should include only English letters and hyphens. Try again");
        }

        System.out.println("Now enter your last name");
        while (true){
            lastName = scan.nextLine();
            Matcher matcher = pattern.matcher(lastName);
            if (matcher.find()){
                System.out.println("Nice");
                break;
            }else
                System.out.println("Name should include only English letters and hyphens. Try again");
        }
        String[] greetings = {
                "Hello, %s %s! Welcome aboard!",
                "Nice to meet you, %s %s!",
                "Greetings, %s %s! Hope you have a great day!",
                "Welcome, %s %s! Let's get started!",
                "Hi there, %s %s! Glad you're here!"
        };

        Random rand = new Random();
        int index = rand.nextInt(greetings.length);
        String message = greetings[index];

        System.out.printf(message +"\n", firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
