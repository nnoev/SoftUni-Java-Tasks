package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _08_Lunch_Break {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int durationseries = Integer.parseInt(scanner.nextLine());
        int lunchbreak = Integer.parseInt(scanner.nextLine());
        double lunch = lunchbreak / 8.0;
        double rest = lunchbreak / 4.0;
        double timeleft = lunchbreak - lunch - rest;
        if (durationseries <= timeleft) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", title, Math.ceil(timeleft-durationseries));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", title, Math.ceil(durationseries-timeleft));
        }

    }
}
