package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _07_School_Camp {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        String sport = "";

        if (groupType.equals("girls")) {
            switch (season) { case "Winter": sport="Gymnastics"; pricePerNight=9.60; break; case "Spring": sport="Athletics"; pricePerNight=7.20; break; case "Summer": sport="Volleyball"; pricePerNight=15; break; }
        } else if (groupType.equals("boys")) {
            switch (season) { case "Winter": sport="Judo"; pricePerNight=9.60; break; case "Spring": sport="Tennis"; pricePerNight=7.20; break; case "Summer": sport="Football"; pricePerNight=15; break; }
        } else {
            switch (season) { case "Winter": sport="Ski"; pricePerNight=10; break; case "Spring": sport="Cycling"; pricePerNight=9.50; break; case "Summer": sport="Swimming"; pricePerNight=20; break; }
        }

        double total = pricePerNight * students * nights;
        if (students >= 50) total *= 0.50;
        else if (students >= 20) total *= 0.85;
        else if (students >= 10) total *= 0.95;

        System.out.printf("%s %.2f lv.%n", sport, total);

    }
}
