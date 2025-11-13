package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _09_Fruit_or_Vegetable {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "grapes":
            case "cherry":
            case "lemon":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
