package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _08_Fuel_Tank_Part_2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double pricePerLiter = 0.0;

        switch (fuelType) {
            case "Gasoline":
                pricePerLiter = 2.22;
                if (card.equals("Yes")) {
                    pricePerLiter -= 0.18;
                }
                break;
            case "Diesel":
                pricePerLiter = 2.33;
                if (card.equals("Yes")) {
                    pricePerLiter -= 0.12;
                }
                break;
            case "Gas":
                pricePerLiter = 0.93;
                if (card.equals("Yes")) {
                    pricePerLiter -= 0.08;
                }
                break;
        }

        double totalPrice = pricePerLiter * liters;

        if (liters >= 20 && liters <= 25) {
            totalPrice *= 0.92; // 8% discount
        } else if (liters > 25) {
            totalPrice *= 0.90; // 10% discount
        }

        System.out.printf("%.2f lv.%n", totalPrice);

    }
}
