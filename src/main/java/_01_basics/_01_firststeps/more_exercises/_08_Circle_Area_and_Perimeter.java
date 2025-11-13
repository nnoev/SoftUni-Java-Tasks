package _01_basics._01_firststeps.more_exercises;

import java.util.Scanner;

public class _08_Circle_Area_and_Perimeter {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r =Double.parseDouble(scanner.nextLine());
        double calculatedArea = Math.PI*r*r;
        double calculatedParameter = Math.PI*r*2;
        System.out.printf("%.2f",calculatedArea);
        System.out.println();
        System.out.printf("%.2f",calculatedParameter);
    }
}
