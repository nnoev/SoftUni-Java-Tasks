package _01_basics._03_conditional_statements_advanced.lab;

import java.util.Scanner;

public class _04_Personal_Titles {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        switch (sex){
            case "m":
                if (age<16) {
                    System.out.println("Master");
                }else {
                    System.out.println("Mr.");
                }
                break;
            case "f":
                if (age<16){
                    System.out.println("Miss");
                }
                else {
                    System.out.println("Ms.");
                }
                break;

        }

    }
}
