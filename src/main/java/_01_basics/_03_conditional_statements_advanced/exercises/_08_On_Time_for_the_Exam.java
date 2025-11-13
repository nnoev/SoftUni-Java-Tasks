package _01_basics._03_conditional_statements_advanced.exercises;

import java.util.Scanner;

public class _08_On_Time_for_the_Exam {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Exam_hour = Integer.parseInt(scanner.nextLine());
        int Exam_min = Integer.parseInt(scanner.nextLine());
        int Arr_hour = Integer.parseInt(scanner.nextLine());
        int Arr_min = Integer.parseInt(scanner.nextLine());
        int examMinutes = Exam_hour * 60 + Exam_min;
        int arrMinutes = Arr_hour * 60 + Arr_min;
        if (examMinutes == arrMinutes) {
            System.out.println("On time");
        } else if (arrMinutes > examMinutes) {
            System.out.println("Late");
            int diff = arrMinutes - examMinutes;
            int h = diff / 60;
            int m = diff % 60;
            if (diff >= 60) {
                System.out.printf("%d:%02d hours after the start", h, m);
            } else {
                System.out.printf("%d minutes after the start", m);
            }
        } else if (examMinutes-arrMinutes<=30) {
            System.out.println("On time");
            int diff = arrMinutes - examMinutes;
            int h = Math.abs(diff / 60);
            int m =Math.abs(diff % 60);
            if (diff >= 60) {
                System.out.printf("%d:%02d hours before the start", h, m);
            } else {
                System.out.printf("%d minutes before the start", m);
            }
        } else if (examMinutes-arrMinutes>30) {
            System.out.println("Early");
            int diff =Math.abs(arrMinutes - examMinutes);
            int h =Math.abs(diff / 60);
            int m =Math.abs(diff % 60);
            if (diff >= 60) {
                System.out.printf("%d:%02d hours before the start", h, m);
            } else {
                System.out.printf("%d minutes before the start", m);
            }
        }

    }
}
