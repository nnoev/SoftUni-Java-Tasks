package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _01_USD_to_BGN {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        System.out.println(number*1.79549);

    }
}
