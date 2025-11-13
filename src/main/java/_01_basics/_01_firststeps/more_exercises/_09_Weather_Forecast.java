package _01_basics._01_firststeps.more_exercises;

import java.util.Scanner;

public class _09_Weather_Forecast {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        switch (text){
            case "sunny" :
                System.out.println("It's warm outside!");
                break;
            default:
                System.out.println( "It's cold outside!");
                break;
        }
    }
}
