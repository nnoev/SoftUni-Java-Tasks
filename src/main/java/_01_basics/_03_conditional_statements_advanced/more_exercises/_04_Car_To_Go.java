package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _04_Car_To_Go {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double price = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                price = budget * 0.35;
            } else {
                carType = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                price = budget * 0.45;
            } else {
                carType = "Jeep";
                price = budget * 0.80;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * 0.90;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f%n", carType, price);

    }
}
