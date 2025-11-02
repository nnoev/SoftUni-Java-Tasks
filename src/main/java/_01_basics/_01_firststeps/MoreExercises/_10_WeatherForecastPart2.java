package _01_basics._01_firststeps.MoreExercises;

import java.util.Scanner;

public class _10_WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double n =Double.parseDouble(scanner.nextLine());
        if (n<5 || n>35){
            System.out.println("unknown");
        } else if (n>=5 && n<12) {
            System.out.println("Cold");
        } else if (n>=12 && n<15) {
            System.out.println("Cool");
        } else if (n>=15 && n<=20) {
            System.out.println("Mild");
        } else if (n>20 && n<26) {
            System.out.println("Warm");
        } else if (n>=26) {
            System.out.println("Hot");
        }
    }
}
