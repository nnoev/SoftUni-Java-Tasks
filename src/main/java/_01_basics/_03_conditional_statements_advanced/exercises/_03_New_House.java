package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _03_New_House {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double R = quantity * 5;
        double D = quantity * 3.8;
        double L = quantity * 2.8;
        double N = quantity * 3;
        double G = quantity * 2.5;
        switch (flowers) {
            case "Roses":
                if (quantity <= 80 && budget >= R) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - R);
                } else if (quantity <= 80 && budget < R) {
                    System.out.printf("Not enough money, you need %.2f leva more.", R - budget);
                } else if (quantity > 80 && budget >= R * 0.9) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - R * 0.9);
                } else if (quantity > 80 && budget < R * 0.9) {
                    System.out.printf("Not enough money, you need %.2f leva more.", R*0.9 - budget);
                }
                break;
            case "Dahlias":
                if (quantity <= 90 && budget >= D) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - D);
                } else if (quantity <= 90 && budget < D) {
                    System.out.printf("Not enough money, you need %.2f leva more.", D - budget);
                } else if (quantity > 90 && budget >= D * 0.85) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - D * 0.85);
                } else if (quantity > 90 && budget < D * 0.85) {
                    System.out.printf("Not enough money, you need %.2f leva more.", D*0.85 - budget);
                }
                break;
            case "Tulips":
                if (quantity <= 80 && budget >= L) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - L);
                } else if (quantity <= 80 && budget < L) {
                    System.out.printf("Not enough money, you need %.2f leva more.", L - budget);
                } else if (quantity > 80 && budget >= L * 0.85) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - L * 0.85);
                } else if (quantity > 80 && budget < L * 0.85) {
                    System.out.printf("Not enough money, you need %.2f leva more.", L*0.85 - budget);
                }
                break;
            case "Narcissus":
                if (quantity < 120 && budget >= N*1.15) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - N*1.15);
                } else if (quantity < 120 && budget < N*1.15) {
                    System.out.printf("Not enough money, you need %.2f leva more.", N*1.15 - budget);
                } else if (quantity >= 120 && budget >= N) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - N);
                } else if (quantity>= 120 && budget < N) {
                    System.out.printf("Not enough money, you need %.2f leva more.", N - budget);
                }
                break;
            case "Gladiolus":
                if (quantity < 80 && budget >= G*1.2) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - G*1.2);
                } else if (quantity < 80 && budget < G*1.2) {
                    System.out.printf("Not enough money, you need %.2f leva more.", G*1.2 - budget);
                } else if (quantity >= 80 && budget >= G) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - G);
                } else if (quantity >= 80 && budget < G) {
                    System.out.printf("Not enough money, you need %.2f leva more.", G - budget);
                }
                break;
        }
    }
}
