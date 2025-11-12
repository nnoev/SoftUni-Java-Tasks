package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());
        double costCover = (n1+2)*1.5;
        double costPaint = n2*1.1*14.5;
        double costPaintThinner = n3*5;
        double costWork = n4*((costCover+costPaint+costPaintThinner+0.4)*0.3);
        double finalCost = costCover+costPaint+costPaintThinner+costWork+0.4;
        System.out.println(finalCost);
    }
}
