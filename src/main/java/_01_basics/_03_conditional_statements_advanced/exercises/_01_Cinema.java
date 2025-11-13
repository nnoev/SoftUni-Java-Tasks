package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _01_Cinema {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        switch (type) {
            case "Premiere":
                System.out.printf("%.2f", (double) c * r*12, "leva");
                break;
            case "Normal":
                System.out.printf("%.2f", (double) c * r*7.5, "leva");
                break;
            case "Discount":
                System.out.printf("%.2f", (double) c * r*5, "leva");
                break;
        }
    }
}
