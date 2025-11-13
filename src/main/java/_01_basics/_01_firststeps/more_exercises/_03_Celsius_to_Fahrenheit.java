package _01_basics._01_firststeps.more_exercises;

import java.util.Scanner;

public class _03_Celsius_to_Fahrenheit {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c =Double.parseDouble(scanner.nextLine());
        double f = c*9/5+32;
        System.out.printf("%.2f",f);
    }
}
