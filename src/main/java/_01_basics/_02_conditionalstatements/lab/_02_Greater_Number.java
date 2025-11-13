package _01_basics._02_conditionalstatements.lab;

import java.util.Scanner;

public class _02_Greater_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
