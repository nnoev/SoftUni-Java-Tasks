package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _12_Trade_Commissions {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                System.out.printf("%.2f", sales * 0.05);
            } else if (sales > 500 && sales <= 1000) {
                System.out.printf("%.2f", sales * 0.07);
            } else if (sales > 1000 && sales <= 10000) {
                System.out.printf("%.2f", sales * 0.08);
            } else if (sales > 10000) {
                System.out.printf("%.2f", sales * 0.12);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                System.out.printf("%.2f", sales * 0.045);
            } else if (sales > 500 && sales <= 1000) {
                System.out.printf("%.2f", sales * 0.075);
            } else if (sales > 1000 && sales <= 10000) {
                System.out.printf("%.2f", sales * 0.1);
            } else if (sales > 10000) {
                System.out.printf("%.2f", sales * 0.13);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                System.out.printf("%.2f", sales * 0.055);
            } else if (sales > 500 && sales <= 1000) {
                System.out.printf("%.2f", sales * 0.08);
            } else if (sales > 1000 && sales <= 10000) {
                System.out.printf("%.2f", sales * 0.12);
            } else if (sales > 10000) {
                System.out.printf("%.2f", sales * 0.145);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
