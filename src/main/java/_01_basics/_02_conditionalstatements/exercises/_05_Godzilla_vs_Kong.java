package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _05_Godzilla_vs_Kong {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double cps = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        if (statists > 150) {
            cps = cps * 0.9;
        }
        double moneyneed = decor + (statists * cps);
        double diff = Math.abs(moneyneed - budget);
        if (moneyneed > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        }
    }
}
