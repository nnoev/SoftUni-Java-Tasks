package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _07_Working_Hours {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if (time >= 10 && time <= 18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":

                    System.out.println("open");
                    break;
                case "Sunday":
                    System.out.println("closed");
                    break;
            }
        } else {
            System.out.println("closed");
        }

    }
}
