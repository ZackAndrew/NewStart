package Homework11.PracticalTask3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();

        usernames.add("john_doe");
        usernames.add("alex123");
        usernames.add("a_b");
        usernames.add("superLongUsername123");
        usernames.add("inv@lid");

        String regex = "^[\\w]{3,15}$";
        Pattern pattern = Pattern.compile(regex);


        for (String s : usernames){
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                System.out.println("good");
            }else
                System.out.println("wrong input");
        }
    }}
