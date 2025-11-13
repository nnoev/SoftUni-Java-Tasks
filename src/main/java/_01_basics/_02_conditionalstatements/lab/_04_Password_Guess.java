package _01_basics._02_conditionalstatements.lab;

import java.util.Scanner;

public class _04_Password_Guess {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = "s3cr3t!P@ssw0rd";
        String input = scanner.nextLine();
        if (pass.equals(input)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
