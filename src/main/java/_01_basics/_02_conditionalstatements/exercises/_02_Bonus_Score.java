package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _02_Bonus_Score {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (a <= 100) {
            bonus = 5;
        } else if (a > 1000) {
            bonus = a * 0.1;
        } else {
            bonus = a * 0.2;
        }
        if (a % 2 == 0) {
            bonus = bonus + 1;
        } else if (a % 5 == 0) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + a);
    }
}
