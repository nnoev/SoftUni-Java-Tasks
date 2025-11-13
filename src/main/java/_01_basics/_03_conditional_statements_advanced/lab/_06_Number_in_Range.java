package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _06_Number_in_Range {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        if (number<=100 && number!=0 && number>=-100){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
