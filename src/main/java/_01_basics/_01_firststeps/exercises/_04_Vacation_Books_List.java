package _01_basics._01_firststeps.exercises;

import java.util.Scanner;

public class _04_Vacation_Books_List {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = Double.parseDouble(scanner.nextLine());
        double number2= Double.parseDouble(scanner.nextLine());
        double number3 = Double.parseDouble(scanner.nextLine());
        int answer = (int) (number1/number2/number3);
        System.out.println(answer);
    }
}
