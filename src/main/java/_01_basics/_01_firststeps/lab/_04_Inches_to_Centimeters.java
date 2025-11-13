package _01_basics._01_firststeps.lab;

import java.util.Scanner;

public class _04_Inches_to_Centimeters {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centimeters = Double.parseDouble(scanner.nextLine());
        double inches = centimeters * 2.54;
        System.out.println(inches);
    }
}
