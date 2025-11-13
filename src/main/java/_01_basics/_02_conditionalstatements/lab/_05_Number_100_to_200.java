package _01_basics._02_conditionalstatements.lab;

import java.util.Scanner;

public class _05_Number_100_to_200 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 100) {
            System.out.println("Less than 100");
        } else if (n>=100&&n<=200) {
            System.out.println("Between 100 and 200");
        }else {
            System.out.println("Greater than 200");
        }
    }
}
