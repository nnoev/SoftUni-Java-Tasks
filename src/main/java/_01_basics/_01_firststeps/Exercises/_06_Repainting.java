package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double price = ((plastic+2)*1.5)+ ((paint*1.1)*14.5)+(thinner*5)+0.4;
        double pricePerHour = price*0.3;
        double sum = price+pricePerHour*hours;

        System.out.println(sum);
    }
}
