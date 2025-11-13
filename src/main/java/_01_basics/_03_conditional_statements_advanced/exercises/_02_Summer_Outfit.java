package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _02_Summer_Outfit {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        if (c >= 10 && c <= 18) {
            switch (time) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", c);
                    break;
                case "Afternoon", "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", c);
                    break;
            }
        } else if (c > 18 && c <= 24) {
            switch (time) {
                case "Morning", "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", c);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", c);
                    break;
            }
        } else if (c >= 25) {
            switch (time) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", c);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", c);
                    break;
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", c);
                    break;
            }

        }
    }
}
