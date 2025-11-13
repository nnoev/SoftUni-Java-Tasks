package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _01_Match_Tickets {
    public static void main(String[] args) {
        // Paste the code body here
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double transportPercent;
        if (people >= 1 && people <= 4) transportPercent = 0.75;
        else if (people <= 9) transportPercent = 0.60;
        else if (people <= 24) transportPercent = 0.50;
        else if (people <= 49) transportPercent = 0.40;
        else transportPercent = 0.25;

        double remainingBudget = budget * (1 - transportPercent);
        double ticketPrice = category.equals("VIP") ? 499.99 : 249.99;
        double totalTickets = ticketPrice * people;

        if (remainingBudget >= totalTickets) {
            System.out.printf("Yes! You have %.2f leva left.%n", remainingBudget - totalTickets);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.%n", totalTickets - remainingBudget);
        }
    }
}
