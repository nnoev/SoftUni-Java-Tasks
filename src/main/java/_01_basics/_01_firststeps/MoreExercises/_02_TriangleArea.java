package _01_basics._01_firststeps.MoreExercises;

import java.util.Scanner;

public class _02_TriangleArea {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double a =Double.parseDouble(scanner.nextLine());
       double h =Double.parseDouble(scanner.nextLine());
       double area = a*h/2;
        System.out.printf("%.2f",area);
    }
}
