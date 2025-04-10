package Homework4.PracticalTask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country;
        System.out.println("Enter the country: ");
        country = scan.nextLine().trim().toLowerCase();
        Continents continent;
        switch (country){
            case "ukraine":
            case "germany":
                continent = Continents.EUROPE;
                break;
            case "china":
            case "india":
            case "japan":
            case "south korea":
                continent = Continents.ASIA;
                break;
            case "nigeria":
            case "egypt":
            case "south africa":
            case "kenya":
                continent = Continents.AFRICA;
                break;
            case "united states":
            case "canada":
            case "mexico":
                continent = Continents.NORTH_AMERICA;
                break;
            case "brazil":
            case "argentina":
            case "colombia":
                continent = Continents.SOUTH_AMERICA;
                break;
            case "australia":
                continent = Continents.AUSTRALIA;
                break;
            case "antarctica":
                continent = Continents.ANTARCTICA;
                break;
            default:
                System.out.println("Country not recognized or not in the database.");
                return;
        }
        System.out.println(country+" is in: "+ continent);
    }
}
