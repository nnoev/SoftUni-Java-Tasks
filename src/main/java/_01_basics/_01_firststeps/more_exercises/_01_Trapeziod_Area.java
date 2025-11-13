package _01_basics._01_firststeps.more_exercises;

import java.util.Scanner;

public class _01_Trapeziod_Area {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 =Double.parseDouble(scanner.nextLine());
        double b2 =Double.parseDouble(scanner.nextLine());
        double h =Double.parseDouble(scanner.nextLine());
        double area = (b1+b2)*h/2;
        System.out.printf("%.2f",area);
    }
}
