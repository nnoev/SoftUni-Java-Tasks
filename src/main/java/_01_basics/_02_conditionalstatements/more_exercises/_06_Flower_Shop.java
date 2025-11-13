package _01_basics._02_conditionalstatements.more_exercises;

import java.util.Scanner;

public class _06_Flower_Shop {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double total = magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cactuses * 8;
        double totalAfterTax = total * 0.95;

        if (totalAfterTax >= giftPrice) {
            System.out.printf("She is left with %.0f leva.%n", Math.floor(totalAfterTax - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.%n", Math.ceil(giftPrice - totalAfterTax));
        }
    }
}
