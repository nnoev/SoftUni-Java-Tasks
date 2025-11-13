package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _05_Vacation {
  public   static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String accommodation = "";
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")) { location = "Alaska"; price = budget * 0.65; }
            else { location = "Morocco"; price = budget * 0.45; }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) { location = "Alaska"; price = budget * 0.80; }
            else { location = "Morocco"; price = budget * 0.60; }
        } else {
            accommodation = "Hotel";
            if (season.equals("Summer")) location = "Alaska";
            else location = "Morocco";
            price = budget * 0.90;
        }

        System.out.printf("%s - %s - %.2f%n", location, accommodation, price);

    }
}
