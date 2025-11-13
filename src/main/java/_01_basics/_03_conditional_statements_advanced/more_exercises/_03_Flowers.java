package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _03_Flowers {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chryPrice = 0, rosePrice = 0, tulipPrice = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            chryPrice = 2.0; rosePrice = 4.10; tulipPrice = 2.50;
        } else {
            chryPrice = 3.75; rosePrice = 4.50; tulipPrice = 4.15;
        }

        double total = chrysanthemums * chryPrice + roses * rosePrice + tulips * tulipPrice;
        if (holiday.equals("Y")) total *= 1.15;
        if (season.equals("Spring") && tulips > 7) total *= 0.95;
        if (season.equals("Winter") && roses >= 10) total *= 0.90;
        if ((chrysanthemums + roses + tulips) > 20) total *= 0.80;

        total += 2; // arranging
        System.out.printf("%.2f%n", total);

    }
}
