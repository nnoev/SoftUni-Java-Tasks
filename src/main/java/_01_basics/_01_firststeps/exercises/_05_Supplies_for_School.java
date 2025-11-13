package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _05_Supplies_for_School {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());
        double cost = (n1*5.8+n2*7.2+n3*1.2)-((n1*5.8+n2*7.2+n3*1.2)*n4/100);
        System.out.printf("%.2f",cost);
    }
}
