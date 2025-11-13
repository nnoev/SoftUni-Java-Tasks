package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _02_Sleepy_Tom_Cat {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - holidays;
        int playMinutes = workDays * 63 + holidays * 127;

        int norm = 30000;
        int diff = Math.abs(norm - playMinutes);

        int hours = diff / 60;
        int minutes = diff % 60;

        if (playMinutes > norm) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play%n", hours, minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play%n", hours, minutes);
        }
    }
}

