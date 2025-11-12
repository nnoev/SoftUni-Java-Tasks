package _01_basics._01_firststeps.lab;

import java.util.Scanner;

public class _05_Greeting_by_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

    }
}
