package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _04_Transport_Price {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double price;

        if (n < 20) {
            if (timeOfDay.equals("day")) {
                price = 0.70 + n * 0.79;
            } else {
                price = 0.70 + n * 0.90;
            }
        } else if (n < 100) {
            price = n * 0.09;
        } else {
            price = n * 0.06;
        }

        System.out.printf("%.2f%n", price);
    }
}
