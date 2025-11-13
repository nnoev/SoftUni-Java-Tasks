package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _07_Fuel_Tank {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            String lowerFuel = fuelType.toLowerCase();
            if (liters >= 25) {
                System.out.printf("You have enough %s.%n", lowerFuel);
            } else {
                System.out.printf("Fill your tank with %s!%n", lowerFuel);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
