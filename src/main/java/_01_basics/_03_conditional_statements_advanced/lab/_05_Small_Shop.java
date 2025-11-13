package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _05_Small_Shop {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        //град / продукт	coffee	water	beer	sweets	peanuts
        //Sofia	0.50	0.80	1.20	1.45	1.60
        //Plovdiv0.40	0.70	1.15	1.30	1.50
        //Varna	  0.45	0.70	1.10	1.35	1.55
        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    System.out.println(quantity * 0.5);
                } else if (product.equals("water")) {
                    System.out.println(quantity * 0.8);
                } else if (product.equals("beer")) {
                    System.out.println(quantity * 1.2);
                } else if (product.equals("sweets")) {
                    System.out.println(quantity * 1.45);
                } else if (product.equals("peanuts")) {
                    System.out.println(quantity * 1.6);
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    System.out.println(quantity * 0.4);
                } else if (product.equals("water")) {
                    System.out.println(quantity * 0.7);
                } else if (product.equals("beer")) {
                    System.out.println(quantity * 1.15);
                } else if (product.equals("sweets")) {
                    System.out.println(quantity * 1.30);
                } else if (product.equals("peanuts")) {
                    System.out.println(quantity * 1.5);
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    System.out.println(quantity * 0.45);
                } else if (product.equals("water")) {
                    System.out.println(quantity * 0.7);
                } else if (product.equals("beer")) {
                    System.out.println(quantity * 1.1);
                } else if (product.equals("sweets")) {
                    System.out.println(quantity * 1.35);
                } else if (product.equals("peanuts")) {
                    System.out.println(quantity * 1.55);
                }
                break;
        }
    }
}
