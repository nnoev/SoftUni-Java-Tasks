package _01_basics._01_firststeps.MoreExercises;

import java.util.Scanner;

public class _07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x =Double.parseDouble(scanner.nextLine());
        double y =Double.parseDouble(scanner.nextLine());
        double h =Double.parseDouble(scanner.nextLine());
        double sides = x*x*2 + x*y *2 - (1.2*2) - 2*(1.5*1.5);
        double roof = x*y*2 + x*h;
        double paintA = sides/3.4;
        double paintB =roof/4.3;
        System.out.printf("%.2f%n%.2f",paintA,paintB);
    }
}
