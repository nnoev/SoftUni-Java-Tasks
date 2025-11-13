package _01_basics._03_conditional_statements_advanced.more_exercises;

import java.util.Scanner;

public class _02_Bike_Race {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double juniorFee = 0;
        double seniorFee = 0;

        switch (track) {
            case "trail": juniorFee = 5.50; seniorFee = 7.0; break;
            case "cross-country": juniorFee = 8.0; seniorFee = 9.5; break;
            case "downhill": juniorFee = 12.25; seniorFee = 13.75; break;
            case "road": juniorFee = 20.0; seniorFee = 21.5; break;
        }

        double total = juniors * juniorFee + seniors * seniorFee;
        if (track.equals("cross-country") && (juniors + seniors) >= 50) total *= 0.75;
        total *= 0.95; // 5% expenses

        System.out.printf("%.2f%n", total);

    }
}
