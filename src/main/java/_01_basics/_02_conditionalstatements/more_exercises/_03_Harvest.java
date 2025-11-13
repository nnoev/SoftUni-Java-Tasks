package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _03_Harvest {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = x * y;
        double grapesForWine = totalGrapes * 0.40;
        double wineProduced = grapesForWine / 2.5;

        if (wineProduced < z) {
            double wineNeeded = Math.floor(z - wineProduced);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.%n", wineNeeded);
        } else {
            double totalWine = Math.floor(wineProduced);
            double wineLeft = Math.ceil(wineProduced - z);
            double winePerWorker = Math.ceil(wineLeft / workers);

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", totalWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.%n", wineLeft, winePerWorker);
        }
    }
}
