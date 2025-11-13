package _01_basics._02_conditionalstatements.lab;

import java.util.Scanner;

public class _03_Even_or_Odd {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n%2!=0){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
}
