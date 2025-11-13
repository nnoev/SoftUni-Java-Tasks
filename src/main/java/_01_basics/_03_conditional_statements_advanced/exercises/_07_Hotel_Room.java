package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _07_Hotel_Room {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case "May":
            case "October":
                double studio = 50*days;
                double apartment = 65*days;
                if (days <= 7) {
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartment, studio);
                } else if (days > 7 && days <= 14) {
                    double discount = 0.05;
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartment, studio - (studio * discount));
                } else if (days > 14) {
                    double discount = 0.3;
                    double discounta = 0.1;
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", (apartment - (apartment * discounta)), studio - (studio * discount));
                }
                break;
        }
        switch (month) {
            case "June":
            case "September":
                double studio = 75.2*days;
                double apartment = 68.7*days;
                if (days<= 7){
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartment, studio);
                }else if (days > 7 && days <= 14) {
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartment, studio);
                }else if (days > 14) {
                    double discount = 0.2;
                    double discounta = 0.1;
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", (apartment - (apartment * discounta)), studio - (studio * discount));
                }
                break;
        }
        switch (month) {
            case "July":
            case "August":
                double studio = 76*days;
                double apartment = 77*days;
                if (days<=7){
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartment, studio);
                } else if (days > 7 && days <= 14) {
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartment, studio);
                } else if (days > 14) {
                    double discounta = 0.1;
                    System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", (apartment - (apartment * discounta)), studio);
                }
                break;
        }

    }
}
