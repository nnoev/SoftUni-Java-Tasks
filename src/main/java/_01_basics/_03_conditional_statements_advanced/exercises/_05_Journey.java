package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _05_Journey {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        if (budget <= 100) {
            String destination = "Bulgaria";
            if (season.equals("summer")) {
                String type = "Camp";
                double cost = budget * 0.3;
                System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, cost);
            } else if (season.equals("winter")) {
                String type = "Hotel";
                double cost = budget * 0.7;
                System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, cost);
            }
        } else if (budget <= 1000) {
            String destination = "Balkans";
            if (season.equals("summer")) {
                String type = "Camp";
                double cost = budget * 0.4;
                System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, cost);
            } else if (season.equals("winter")) {
                String type = "Hotel";
                double cost = budget * 0.8;
                System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, cost);
            }
        } else {
            String destination = "Europe";
            if (season.equals("summer")) {
                String type = "Hotel";
                double cost = budget * 0.9;
                System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, cost);
            } else if (season.equals("winter")) {
                String type = "Hotel";
                double cost = budget * 0.9;
                System.out.printf("Somewhere in %s%n%s - %.2f", destination, type, cost);
            }

        }
    }
}
