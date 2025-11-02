package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _02_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radian =Double.parseDouble(scanner.nextLine());
        double degrees = radian*180/ Math.PI;
        System.out.println(degrees);
    }
}
