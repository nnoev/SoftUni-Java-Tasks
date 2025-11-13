package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _10_Multiply_by_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num < 0) {
                System.out.println("Negative number!");
                break;
            }
            System.out.printf("Result: %.2f%n", num * 2);
        }

    }
}
