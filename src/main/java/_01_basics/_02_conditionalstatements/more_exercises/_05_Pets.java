package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _05_Pets {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double dogPerDay = Double.parseDouble(scanner.nextLine());
        double catPerDay = Double.parseDouble(scanner.nextLine());
        double turtlePerDayGrams = Double.parseDouble(scanner.nextLine());

        double totalFoodNeeded = days * (dogPerDay + catPerDay + turtlePerDayGrams / 1000);

        if (foodLeftKg >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.%n", Math.floor(foodLeftKg - totalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.%n", Math.ceil(totalFoodNeeded - foodLeftKg));
        }
    }
}
