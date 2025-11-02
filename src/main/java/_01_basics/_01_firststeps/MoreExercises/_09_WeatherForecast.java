package _01_basics._01_firststeps.MoreExercises;

import java.util.Scanner;

public class _09_WeatherForecast {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String text = scanner.nextLine();
        if (text.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
