package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _03_Deposit_Calculator {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double number1 = Double.parseDouble(scanner.nextLine());
        double sum = number+n*((number*number1)/1200);
        System.out.println(sum);
    }
}
