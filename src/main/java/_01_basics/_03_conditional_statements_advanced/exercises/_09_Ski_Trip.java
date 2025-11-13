package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _09_Ski_Trip {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();
        double price = 0;
        switch (room) {
            case "room for one person":
                price = 18 * (days - 1);
                if (rate.equals("positive")) {
                    System.out.printf("%.2f", price * 1.25);
                } else {
                    System.out.printf("%.2f", price * 0.9);
                }
                break;
            case "apartment":
                price = 25 * (days - 1);
                if (days < 10) {
                    price = price * 0.7;
                    if (rate.equals("positive")) {
                        System.out.printf("%.2f", price * 1.25);
                    } else {
                        System.out.printf("%.2f", price * 0.9);
                    }
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.65;
                    if (rate.equals("positive")) {
                        System.out.printf("%.2f", price * 1.25);
                    } else {
                        System.out.printf("%.2f", price * 0.9);
                    }
                } else if (days > 15) {
                    price = price * 0.5;
                    if (rate.equals("positive")) {
                        System.out.printf("%.2f", price * 1.25);
                    } else {
                        System.out.printf("%.2f", price * 0.9);
                    }
                }
                break;
            case "president apartment":
                price = 35 * (days - 1);
                if (days < 10) {
                    price = price * 0.9;
                    if (rate.equals("positive")) {
                        System.out.printf("%.2f", price * 1.25);
                    } else {
                        System.out.printf("%.2f", price * 0.9);
                    }
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.85;
                    if (rate.equals("positive")) {
                        System.out.printf("%.2f", price * 1.25);
                    } else {
                        System.out.printf("%.2f", price * 0.9);
                    }
                } else if (days > 15) {
                    price = price * 0.8;
                    if (rate.equals("positive")) {
                        System.out.printf("%.2f", price * 1.25);
                    } else {
                        System.out.printf("%.2f", price * 0.9);
                    }
                }
                break;
        }

    }
}
