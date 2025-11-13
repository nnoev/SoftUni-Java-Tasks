package _01_basics._01_firststeps.more_exercises;

import java.util.Scanner;

public class _04_Vegetable_Market {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double veggiesPrice =Double.parseDouble(scanner.nextLine());
        double fruitPrice =Double.parseDouble(scanner.nextLine());
        int veggiesKilos = Integer.parseInt(scanner.nextLine());
        int fruitKilos = Integer.parseInt(scanner.nextLine());
        double income = (veggiesPrice*veggiesKilos + fruitKilos*fruitPrice)/1.94;
        System.out.printf("%.2f",income);
    }
}
