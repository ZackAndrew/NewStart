package Homework11.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrencyFinder {
    public static void main(String[] args) {
        String text = "Shoes costs $50.50,  t-shirt $19.00, jeans $93.43";

        String regex = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found)
            System.out.println("Not found");
    }
}
