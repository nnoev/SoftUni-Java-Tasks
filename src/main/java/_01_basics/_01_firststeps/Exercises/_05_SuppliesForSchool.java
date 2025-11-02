package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        double discount =Double.parseDouble(scanner.nextLine());

        double sum = pens*5.8 + markers*7.2 + liters*1.2;
        double a = 1-discount/100;
        System.out.println(sum*a);
    }
}
