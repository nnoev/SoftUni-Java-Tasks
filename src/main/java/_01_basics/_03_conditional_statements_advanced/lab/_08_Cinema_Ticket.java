package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _08_Cinema_Ticket {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
        }
    }
}
