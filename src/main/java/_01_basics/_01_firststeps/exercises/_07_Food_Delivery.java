package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _07_Food_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        double cost1 = n1*10.35;
        double cost2 = n2*12.40;
        double cost3 = n3*8.15;
        double cost4 = (cost1+cost2+cost3)*0.2;
        System.out.println(cost1+cost2+cost3+cost4+2.5);
    }
}
