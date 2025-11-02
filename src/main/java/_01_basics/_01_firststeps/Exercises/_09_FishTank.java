package _01_basics._01_firststeps.Exercises;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double proCent =Double.parseDouble(scanner.nextLine());
        double volume = length*width*height*0.001;
        double total = volume * (1-proCent/100);
        System.out.println(total);
    }
}
