package _01_basics._01_firststeps.MoreExercises;

import java.util.Scanner;

public class _03_CelsiusToFahrenheit {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double c =Double.parseDouble(scanner.nextLine());
       double f = c*9/5+32;
        System.out.printf("%.2f",f);
    }
}
