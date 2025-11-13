package _01_basics._01_firststeps.lab;

import java.util.Scanner;

public class _09_Yard_Greening {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n =Double.parseDouble(scanner.nextLine());
        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.%n",(7.61*n)-7.61*n*0.18,7.61*n*0.18);
    }
}
