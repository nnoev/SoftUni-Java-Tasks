package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit =Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double interest =Double.parseDouble(scanner.nextLine());
        double finalSum = deposit+time*((deposit*interest/100)/12);
        System.out.println(finalSum);
    }
}
