package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _02_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        System.out.println(number*180/Math.PI);
    }
}
