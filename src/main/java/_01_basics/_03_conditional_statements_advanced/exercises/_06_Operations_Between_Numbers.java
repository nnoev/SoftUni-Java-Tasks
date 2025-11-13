package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _06_Operations_Between_Numbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        if (symbol.equals("+")) {
            double result = N1 + N2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", N1, symbol, N2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", N1, symbol, N2, result);
            }
        } else if (symbol.equals("-")) {
            double result = N1 - N2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", N1, symbol, N2, result);
            }else {
                System.out.printf("%d %s %d = %.0f - odd", N1, symbol, N2, result);
            }
        } else if (symbol.equals("*")) {
            double result = N1 * N2;
            if (result%2==0) {
                System.out.printf("%d %s %d = %.0f - even", N1, symbol, N2, result);
            }else {
                System.out.printf("%d %s %d = %.0f - odd", N1, symbol, N2, result);
            }
        } else if (symbol.equals("/")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                double result = (double) N1 / N2;
                System.out.printf("%d %s %d = %.2f", N1, symbol, N2, result);
            }
        } else if (symbol.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                double result = N1 % N2;
                System.out.printf("%d %s %d = %.0f", N1, symbol, N2, result);
            }
        }
    }
}
