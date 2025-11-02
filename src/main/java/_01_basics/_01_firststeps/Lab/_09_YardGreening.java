package _01_basics._01_firststeps.Lab;

import java.util.Scanner;

public class _09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double discount = area * 7.61 * 0.18;
        double price = area * 7.61 - discount;
        System.out.printf("The final price is: %.2f lv.%n The discount is: %.2f lv.", price, discount);
    }
}
