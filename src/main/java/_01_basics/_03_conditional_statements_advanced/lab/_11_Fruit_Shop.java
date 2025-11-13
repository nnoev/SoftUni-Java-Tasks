package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _11_Fruit_Shop {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (day.equals("Saturday")||day.equals("Sunday")){
            switch (product) {
                case "banana":
                    System.out.printf("%.2f",quantity * 2.7);
                    break;
                case "apple":
                    System.out.printf("%.2f",quantity * 1.25);
                    break;
                case "orange":
                    System.out.printf("%.2f",quantity * 0.9);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f",quantity * 1.6);
                    break;
                case "kiwi":
                    System.out.printf("%.2f",quantity * 3);
                    break;
                case "pineapple":
                    System.out.printf("%.2f",quantity * 5.6);
                    break;
                case "grapes":
                    System.out.printf("%.2f",quantity * 4.2);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) {
            switch (product) {
                case "banana":
                    System.out.printf("%.2f",quantity * 2.5);
                    break;
                case "apple":
                    System.out.printf("%.2f",quantity * 1.2);
                    break;
                case "orange":
                    System.out.printf("%.2f",quantity * 0.85);
                    break;
                case "grapefruit":
                    System.out.printf("%.2f",quantity * 1.45);
                    break;
                case "kiwi":
                    System.out.printf("%.2f",quantity * 2.7);
                    break;
                case "pineapple":
                    System.out.printf("%.2f",quantity * 5.5);
                    break;
                case "grapes":
                    System.out.printf("%.2f",quantity * 3.85);
                    break;
                default:
                    System.out.printf("error");
            }
        }else {
            System.out.printf("error");
        }
    }
}
