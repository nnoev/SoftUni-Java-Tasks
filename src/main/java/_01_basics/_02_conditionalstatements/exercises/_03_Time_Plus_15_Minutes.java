package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _03_Time_Plus_15_Minutes {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int newmin = 0;
        if (h >= 0 && h < 23 && m < 45) {
            newmin = m + 15;
            System.out.printf("%d:%d", h, newmin);
        } else if (h >= 0 && h < 23 && m >= 45 && m <= 54) {
            h = h + 1;
            newmin = (m + 15) % 60;
            System.out.printf("%d:0%d", h, newmin);
        } else if (h >= 0 && h < 23 && m > 54) {
            h = h + 1;
            newmin = (m + 15) % 60;
            System.out.printf("%d:%d", h, newmin);
        } else if (h == 23 && m < 45 & m != 0) {
            newmin = m + 15;
            h = 23;
            System.out.printf("%d:%d", h, newmin);
        } else if (h == 23 && m >= 45 && m <= 54) {
            h = 0;
            newmin = (m + 15) % 60;
            System.out.printf("%d:0%d", h, newmin);
        } else if (h == 23 && m > 54 && m <= 59) {
            h = 0;
            newmin = (m + 15) % 60;
            System.out.printf("%d:%d", h, newmin);
        } else if (h < 23 && m == 0) {
            newmin = 15;
            System.out.printf("%d:%d", h, newmin);
        } else if (h == 23 && m == 0) {
            h = 23;
            newmin = 15;
            System.out.printf("%d:%d", h, newmin);
        }
    }
}
