package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _01_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd =Double.parseDouble(scanner.nextLine());
        double bgn = usd*1.79549;
        System.out.println(bgn);

    }
}
