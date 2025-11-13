package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _04_Toy_Shop {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double turnover = puzzle * 2.6 + doll * 3 + bear * 4.1 + minions * 8.2 + truck * 2;
        double left = 0;
        int b = puzzle + doll + bear + minions + truck;
        if (b >= 50) {
            turnover = turnover * 0.75;
        }
        turnover = turnover * 0.9;
        if (price <= turnover) {
            left = turnover - price;
            System.out.printf("Yes! %.2f lv left.", left);
        } else {
            left = price - turnover;
            System.out.printf("Not enough money! %.2f lv needed.", left);
        }

    }
}
