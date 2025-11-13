package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _04_Fishing_Boat {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        int boat = 0;
        switch (season) {
            case "Spring":
                boat = 3000;
                break;
            case "Summer":
            case "Autumn":
                boat = 4200;
                break;
            case "Winter":
                boat = 2600;
                break;
            default:
                boat = 0;
                break;
        }
        if (fishermen <= 6) {
            double price = boat * 0.9;
            if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                price = price * 0.95;
            }
            if (budget >= price) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        } else if (fishermen > 6 && fishermen < 12) {
            double price = boat * 0.85;
            if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                price = price * 0.95;
            }
            if (budget >= price) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        } else if (fishermen >= 12) {
            double price = boat * 0.75;
            if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                price = price * 0.95;
            }
            if (budget >= price) {
                System.out.printf("Yes! You have %.2f leva left.", budget - price);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", price - budget);
            }
        }

    }
}
