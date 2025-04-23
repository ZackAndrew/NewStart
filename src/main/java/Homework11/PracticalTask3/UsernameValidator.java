package Homework11.PracticalTask3;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();

        usernames.add("john_doe");
        usernames.add("alex123");
        usernames.add("a_b");
        usernames.add("superLongUsername123"); // too long
        usernames.add("inv@lid");

        String regex = "^[\\w]{3,5}$";

//        for (String s : usernames){
//            if (Pattern.)
//        }
    }}
