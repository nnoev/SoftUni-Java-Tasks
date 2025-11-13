package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _06_Truck_Driver {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double rate = 0;
        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Spring": case "Autumn": rate = 0.75; break;
                case "Summer": rate = 0.90; break;
                case "Winter": rate = 1.05; break;
            }
        } else if (kmPerMonth <= 10000) {
            switch (season) {
                case "Spring": case "Autumn": rate = 0.95; break;
                case "Summer": rate = 1.10; break;
                case "Winter": rate = 1.25; break;
            }
        } else rate = 1.45;

        double total = kmPerMonth * rate * 4; // 4 months
        total *= 0.90; // taxes
        System.out.printf("%.2f%n", total);

    }
}
