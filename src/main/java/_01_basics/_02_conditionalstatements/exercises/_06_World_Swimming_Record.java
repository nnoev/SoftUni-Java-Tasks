package _01_basics._02_conditionalstatements.exercises;

import java.util.Scanner;

public class _06_World_Swimming_Record {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double sec = Double.parseDouble(scanner.nextLine());
        double speed = distance*sec;
        double slowpoint = (Math.floor(distance/15))*12.5;
        double time = slowpoint+speed;
        if (time<record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",time);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",time-record);
        }
    }
}
